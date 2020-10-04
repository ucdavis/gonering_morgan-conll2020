library(tidyverse)
library(forcats)
library(purrr)
toyWorld <- tribble(
  ~o1,	~r,	~o2,	~probability,
  "alice",	"eat",	"apple",	0.05,
  "alice",	"eat",	"bread",	0.00,
  "alice",	"eat",	"cake",	0.03,
  "alice",	"eat",	"rice",	0.02,
  "alice",	"drink",	"coffee",	0.07,
  "alice",	"drink",	"cola",	0.03,
  "alice",	"drink",	"juice",	0.00,
  "alice",	"drink",	"water",	0.00,
  "bob",	"eat",	"apple",	0.02,
  "bob",	"eat",	"bread",	0.00,
  "bob",	"eat",	"cake",	0.04,
  "bob",	"eat",	"rice",	0.04,
  "bob",	"drink",	"coffee",	0.02,
  "bob",	"drink",	"cola",	0.04,
  "bob",	"drink",	"juice",	0.02,
  "bob",	"drink",	"water",	0.02,
  "eve",	"eat",	"apple",	0.00,
  "eve",	"eat",	"bread",	0.01,
  "eve",	"eat",	"cake",	0.00,
  "eve",	"eat",	"rice",	0.09,
  "eve",	"drink",	"coffee",	0.03,
  "eve",	"drink",	"cola",	0.01,
  "eve",	"drink",	"juice",	0.00,
  "eve",	"drink",	"water",	0.06,
  "mallory",	"eat",	"apple",	0.04,
  "mallory",	"eat",	"bread",	0.04,
  "mallory",	"eat",	"cake",	0.01,
  "mallory",	"eat",	"rice",	0.01,
  "mallory",	"drink",	"coffee",	0.00,
  "mallory",	"drink",	"cola",	0.01,
  "mallory",	"drink",	"juice",	0.09,
  "mallory",	"drink",	"water",	0.00,
  "trent",	"eat",	"apple",	0.02,
  "trent",	"eat",	"bread",	0.00,
  "trent",	"eat",	"cake",	0.01,
  "trent",	"eat",	"rice",	0.07,
  "trent",	"drink",	"coffee",	0.02,
  "trent",	"drink",	"cola",	0.03,
  "trent",	"drink",	"juice",	0.03,
  "trent",	"drink",	"water",	0.02
) %>%
  mutate(o1 = as.factor(o1), r = as.factor(r), o2 = as.factor(o2))					
calcEnt <- function(df) {
  df %>% summarize(eta = sum(log2(probability)*probability, na.rm = TRUE)*-1)
}

baseEnt <- calcEnt(toyWorld)[[1]]

renorm <- function(x, colm) {
  tw <- toyWorld
  filter(tw, tw[colm] == x) %>% 
    mutate(probability = probability/sum(probability))
}

(s_eta1s <- set_names(levels(toyWorld$o1)) %>% map_df(renorm, colm = 1) %>% group_by(o1) %>% calcEnt %>% rename(eta1 = eta))
(v_eta1s <- set_names(levels(toyWorld$r)) %>% map_df(renorm, colm = 2) %>% group_by(r) %>% calcEnt %>% rename(eta1 = eta))
(o_eta1s <- set_names(levels(toyWorld$o2)) %>% map_df(renorm, colm = 3) %>% group_by(o2) %>% calcEnt %>% rename(eta1 = eta))

renorm2 <- function(y, z, col1, col2) {
  tw <- toyWorld
  filter(tw, tw[col1] == z & tw[col2] == y) %>%
    mutate(probability = probability/sum(probability))
}

(sv_eta2s <- set_names(levels(toyWorld$o1)) %>% map_df(function(x) {
  set_names(levels(toyWorld$r)) %>% map_df(renorm2, z = x, col1 = 1, col2 = 2) %>% group_by(o1, r) %>% calcEnt %>% rename(eta2 = eta)
}))

(so_eta2s <- set_names(levels(toyWorld$o1)) %>% map_df(function(x) {
  set_names(levels(toyWorld$o2)) %>% map_df(renorm2, z = x, col1 = 1, col2 = 3) %>% group_by(o1, o2) %>% calcEnt %>% rename(eta2 = eta)
}))

(vs_eta2s <- set_names(levels(toyWorld$r)) %>% map_df(function(x) {
  set_names(levels(toyWorld$o1)) %>% map_df(renorm2, z = x, col1 = 2, col2 = 1) %>% group_by(r, o1) %>% calcEnt %>% rename(eta2 = eta)
}))

(vo_eta2s <- set_names(levels(toyWorld$r)) %>% map_df(function(x) {
  set_names(levels(toyWorld$o2)) %>% map_df(renorm2, z = x, col1 = 2, col2 = 3) %>% group_by(r, o2) %>% calcEnt %>% rename(eta2 = eta)
}))

(ov_eta2s <- set_names(levels(toyWorld$o2)) %>% map_df(function(x) {
  set_names(levels(toyWorld$r)) %>% map_df(renorm2, z = x, col1 = 3, col2 = 2) %>% group_by(o2, r) %>% calcEnt %>% rename(eta2 = eta)
}))

(os_eta2s <- set_names(levels(toyWorld$o2)) %>% map_df(function(x) {
  set_names(levels(toyWorld$o1)) %>% map_df(renorm2, z = x, col1 = 3, col2 = 1) %>% group_by(o2, o1) %>% calcEnt %>% rename(eta2 = eta)
}))

compInfosandDev <- function(eta1s, eta2s, x) {
  inner_join(eta1s, eta2s, by = x) %>%
    mutate(i1 = baseEnt - eta1, i2 = eta1-eta2, i3 = eta2) %>%
    mutate(normedI1 = i1/baseEnt, normedI2 = i2/baseEnt, normedI3 = i3/baseEnt) %>%
    mutate(deviation_score = 3/4*(abs(normedI1 - 1/3)+abs(normedI2 - 1/3)+abs(normedI3 - 1/3)))
}

(svo_infos <- compInfosandDev(s_eta1s, sv_eta2s, "o1"))
(sov_infos <- compInfosandDev(s_eta1s, so_eta2s, "o1"))
(vso_infos <- compInfosandDev(v_eta1s, vs_eta2s, "r"))
(vos_infos <- compInfosandDev(v_eta1s, vo_eta2s, "r"))
(ovs_infos <- compInfosandDev(o_eta1s, ov_eta2s, "o2"))
(osv_infos <- compInfosandDev(o_eta1s, os_eta2s, "o2"))

weighted_mean_dev_score <- function(scores, col1, col2) {
  tb <- scores %>% select(scores[[col1]], scores[[col2]], deviation_score) %>% inner_join(toyWorld, by = c(col1, col2))
 weighted.mean(tb$deviation_score, tb$probability)
}

svo_score <- weighted_mean_dev_score(svo_infos, "o1", "r")
sov_score <- weighted_mean_dev_score(sov_infos, "o1", "o2")
vso_score <- weighted_mean_dev_score(vso_infos, "r", "o1")
vos_score <- weighted_mean_dev_score(vos_infos, "r", "o2")
ovs_score <- weighted_mean_dev_score(ovs_infos, "o2", "r")
osv_score <- weighted_mean_dev_score(osv_infos, "o2", "o1")

(entRankings <- tribble(
  ~word_order, ~dev_score,
  "ovs", ovs_score,
  "sov", sov_score,
  "osv", osv_score,
  "vos", vos_score,
  "vso", vso_score,
  "svo", svo_score
) %>% arrange(dev_score))


calcSurp <- function(df) {
  df %>% mutate(surp = log2(s_prob)*-1)
}

(s_surp1 <- toyWorld %>% group_by(o1) %>% summarize(s_prob = sum(probability)) %>% calcSurp %>% rename(surp1 = surp))
(v_surp1 <- toyWorld %>% group_by(r) %>% summarize(s_prob = sum(probability)) %>% calcSurp %>% rename(surp1 = surp))
(o_surp1 <- toyWorld %>% group_by(o2) %>% summarize(s_prob = sum(probability)) %>% calcSurp %>% rename(surp1 = surp))

(sv_surp2 <- toyWorld %>% group_by(o1) %>% mutate(x = sum(probability)) %>% group_by(o1, r) %>% mutate(s_prob = sum(probability)/x) %>% calcSurp %>% rename(surp2 = surp))
(so_surp2 <- toyWorld %>% group_by(o1) %>% mutate(x = sum(probability)) %>% group_by(o1, o2) %>% mutate(s_prob = sum(probability)/x) %>% calcSurp %>% rename(surp2 = surp))
(vs_surp2 <- toyWorld %>% group_by(r) %>% mutate(x = sum(probability)) %>% group_by(r, o1) %>% mutate(s_prob = sum(probability)/x) %>% calcSurp %>% rename(surp2 = surp))
(vo_surp2 <- toyWorld %>% group_by(r) %>% mutate(x = sum(probability)) %>% group_by(r, o2) %>% mutate(s_prob = sum(probability)/x) %>% calcSurp %>% rename(surp2 = surp))
(ov_surp2 <- toyWorld %>% group_by(o2) %>% mutate(x = sum(probability)) %>% group_by(o2, r) %>% mutate(s_prob = sum(probability)/x) %>% calcSurp %>% rename(surp2 = surp))
(os_surp2 <- toyWorld %>% group_by(o2) %>% mutate(x = sum(probability)) %>% group_by(o2, o1) %>% mutate(s_prob = sum(probability)/x) %>% calcSurp %>% rename(surp2 = surp))

(svo_surp3 <- toyWorld %>% group_by(o1, r) %>% mutate(s_prob = probability/sum(probability)) %>% calcSurp %>% rename(surp3 = surp))
(sov_surp3 <- toyWorld %>% group_by(o1, o2) %>% mutate(s_prob = probability/sum(probability)) %>% calcSurp %>% rename(surp3 = surp))
(vso_surp3 <- toyWorld %>% group_by(r, o1) %>% mutate(s_prob = probability/sum(probability)) %>% calcSurp %>% rename(surp3 = surp))
(vos_surp3 <- toyWorld %>% group_by(r, o2) %>% mutate(s_prob = probability/sum(probability)) %>% calcSurp %>% rename(surp3 = surp))
(ovs_surp3 <- toyWorld %>% group_by(o2, r) %>% mutate(s_prob = probability/sum(probability)) %>% calcSurp %>% rename(surp3 = surp))
(osv_surp3 <- toyWorld %>% group_by(o2, o1) %>% mutate(s_prob = probability/sum(probability)) %>% calcSurp %>% rename(surp3 = surp))

compNormedSandSDev <- function(tb_surp3, tb_surp2, tb_surp1, keys, firstKey) {
  inner_join(tb_surp3, tb_surp2, by = keys) %>% 
    rename(prob = probability.x) %>% 
    inner_join(tb_surp1, by = firstKey) %>% 
    mutate(neg_log_p = -log2(prob)) %>% 
    mutate(tot = surp1 + surp2 + surp3) %>% 
    select(o1, r, o2, prob, neg_log_p, surp1, surp2, surp3, tot) %>%
    mutate(normedS1 = surp1/neg_log_p, normedS2 = surp2/neg_log_p, normedS3 = surp3/neg_log_p) %>%
    mutate(deviation_score = 3/4*(abs(normedS1 - 1/3)+abs(normedS2 - 1/3)+abs(normedS3 - 1/3))) %>%
    ungroup()
}

weighted_mean_dev_score_surp <- function(scores, col1, col2, col3) {
tb <- scores %>% select(scores[[col1]], scores[[col2]], scores[[col3]], deviation_score) %>% inner_join(toyWorld, by = c(col1, col2, col3))
  weighted.mean(tb$deviation_score, tb$prob)
}

svo_surp_score <- svo_surp3 %>% compNormedSandSDev(sv_surp2, s_surp1, c("o1", "r", "o2"), "o1") %>% weighted_mean_dev_score_surp("o1", "r", "o2")
sov_surp_score <- sov_surp3 %>% compNormedSandSDev(so_surp2, s_surp1, c("o1", "o2", "r"), "o1") %>% weighted_mean_dev_score_surp("o1", "o2", "r")
vso_surp_score <- vso_surp3 %>% compNormedSandSDev(vs_surp2, v_surp1, c("r", "o1", "o2"), "r") %>% weighted_mean_dev_score_surp("r", "o1", "o2")
vos_surp_score <- vos_surp3 %>% compNormedSandSDev(vo_surp2, v_surp1, c("r", "o2", "o1"), "r") %>% weighted_mean_dev_score_surp("r", "o2", "o1")
ovs_surp_score <- ovs_surp3 %>% compNormedSandSDev(ov_surp2, o_surp1, c("o2", "r", "o1"), "o2") %>% weighted_mean_dev_score_surp("o2", "r", "o1")
osv_surp_score <- osv_surp3 %>% compNormedSandSDev(os_surp2, o_surp1, c("o2", "o1", "r"), "o2") %>% weighted_mean_dev_score_surp("o2", "o1", "r")

(surpRankings <- tribble(
  ~word_order, ~dev_score,
  "ovs", ovs_surp_score,
  "sov", sov_surp_score,
  "osv", osv_surp_score,
  "vos", vos_surp_score,
  "vso", vso_surp_score,
  "svo", svo_surp_score
) %>% arrange(dev_score))

# MI: log[p(x,y)/p(x)p(y)]
# for sv=vs: log[p(o1, r)/p(o1)p(r)]
# for vo=ov: log[p(r, o2)/p(r)p(o2)]
# for so=os: log[p(o1, o2)/p(o1)p(o2)]

# p(o1, r) = p(alice, eat) = p(alice, eat, bread) + p(alice, eat, rice) + p(alice, eat, apple) + p(alice, eat, cake)
# p(o1) = p(alice, eat, bread) + p(alice, drink, coffee) + etc
# p(r) = p(alice, eat, bread) + p(bob, eat, cake) + etc

(mutInfo_o1_r <- toyWorld %>% 
    group_by(o1, r) %>% 
    mutate(p_o1_r = sum(probability)) %>% 
    group_by(o1) %>% 
    mutate(p_o1 = sum(probability)) %>% 
    group_by(r) %>% 
    mutate(p_r = sum(probability)) %>%
    ungroup %>%
    mutate(mi_o1_r = log2(p_o1_r/(p_o1*p_r))))

(mutInfo_r_o2 <- toyWorld %>% 
    group_by(r, o2) %>% 
    mutate(p_r_o2 = sum(probability)) %>% 
    group_by(r) %>% 
    mutate(p_r = sum(probability)) %>% 
    group_by(o2) %>% 
    mutate(p_o2 = sum(probability)) %>%
    ungroup %>%
    mutate(mi_r_o2 = log2(p_r_o2/(p_o2*p_r))))

(mutInfo_o1_o2 <- toyWorld %>% 
    group_by(o1, o2) %>% 
    mutate(p_o1_o2 = sum(probability)) %>% 
    group_by(o1) %>% 
    mutate(p_o1 = sum(probability)) %>% 
    group_by(o2) %>% 
    mutate(p_o2 = sum(probability)) %>%
    ungroup %>%
    mutate(mi_o1_o2 = log2(p_o1_o2/(p_o1*p_o2))))

mi_sv <- weighted.mean(mutInfo_o1_r$mi_o1_r, mutInfo_o1_r$probability)
mi_vo <- weighted.mean(mutInfo_r_o2$mi_r_o2, mutInfo_r_o2$probability)
mi_so <- weighted.mean(mutInfo_o1_o2$mi_o1_o2, mutInfo_o1_o2$probability)

mi_svo <- mi_sv + mi_vo
mi_sov <- mi_so + mi_vo
mi_vso <- mi_sv + mi_so
mi_vos <- mi_vo + mi_so
mi_ovs <- mi_vo + mi_sv
mi_osv <- mi_so + mi_sv

(miRankings <- tribble(
  ~word_order, ~mi,
  "ovs", mi_ovs,
  "sov", mi_sov,
  "osv", mi_osv,
  "vos", mi_vos,
  "vso", mi_vso,
  "svo", mi_svo
) %>% arrange(desc(mi)))