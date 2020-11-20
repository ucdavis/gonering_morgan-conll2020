library(tidyverse)
library(ggplot2)
library(scales)
library(gridExtra)
library(ggrepel)
library(eulerr)
library(ggforce)
library(grid)

################## function definitions ##########################################

calcEntRankings <- function(df) {
  svo <- filter(df, Word_Order == "SVO")
  sov <- filter(df, Word_Order == "SOV")
  vso <- filter(df, Word_Order == "VSO")
  vos <- filter(df, Word_Order == "VOS")
  ovs <- filter(df, Word_Order == "OVS")
  osv <- filter(df, Word_Order == "OSV")
  
  svo_ent_mean <- weighted.mean(svo$Entropy_Deviation_Score, svo$Probability)
  sov_ent_mean <- weighted.mean(sov$Entropy_Deviation_Score, sov$Probability)
  vso_ent_mean <- weighted.mean(vso$Entropy_Deviation_Score, vso$Probability)
  vos_ent_mean <- weighted.mean(vos$Entropy_Deviation_Score, vos$Probability)
  ovs_ent_mean <- weighted.mean(ovs$Entropy_Deviation_Score, ovs$Probability)
  osv_ent_mean <- weighted.mean(osv$Entropy_Deviation_Score, osv$Probability)
  
  tribble(
    ~word_order, ~score,
    "OVS", ovs_ent_mean,
    "SOV", sov_ent_mean,
    "OSV", osv_ent_mean,
    "VOS", vos_ent_mean,
    "VSO", vso_ent_mean,
    "SVO", svo_ent_mean
  ) %>% arrange(score) %>%
    mutate(language = df$language[[1]]) %>%
    mutate(measure = "entropy UID") %>%
    mutate(rank = min_rank(score))
}

calcSurpRankings <- function(df) {
  svo <- filter(df, Word_Order == "SVO")
  sov <- filter(df, Word_Order == "SOV")
  vso <- filter(df, Word_Order == "VSO")
  vos <- filter(df, Word_Order == "VOS")
  ovs <- filter(df, Word_Order == "OVS")
  osv <- filter(df, Word_Order == "OSV")
  
  svo_surp_mean <- weighted.mean(svo$Surprisal_Deviation_Score, svo$Probability)
  sov_surp_mean <- weighted.mean(sov$Surprisal_Deviation_Score, sov$Probability)
  vso_surp_mean <- weighted.mean(vso$Surprisal_Deviation_Score, vso$Probability)
  vos_surp_mean <- weighted.mean(vos$Surprisal_Deviation_Score, vos$Probability)
  ovs_surp_mean <- weighted.mean(ovs$Surprisal_Deviation_Score, ovs$Probability)
  osv_surp_mean <- weighted.mean(osv$Surprisal_Deviation_Score, osv$Probability)
  
  tribble(
    ~word_order, ~score,
    "OVS", ovs_surp_mean,
    "SOV", sov_surp_mean,
    "OSV", osv_surp_mean,
    "VOS", vos_surp_mean,
    "VSO", vso_surp_mean,
    "SVO", svo_surp_mean
  ) %>% arrange(score) %>%
    mutate(language = df$language[[1]]) %>%
    mutate(measure = "surprisal UID") %>%
    mutate(rank = min_rank(score))
}

calcMIRankings <- function(df) {
  svo <- filter(df, Word_Order == "SVO")
  sov <- filter(df, Word_Order == "SOV")
  vso <- filter(df, Word_Order == "VSO")
  vos <- filter(df, Word_Order == "VOS")
  ovs <- filter(df, Word_Order == "OVS")
  osv <- filter(df, Word_Order == "OSV")
  
  svo_mi_mean <- weighted.mean(svo$Mutual_Information, svo$Probability)
  sov_mi_mean <- weighted.mean(sov$Mutual_Information, sov$Probability)
  vso_mi_mean <- weighted.mean(vso$Mutual_Information, vso$Probability)
  vos_mi_mean <- weighted.mean(vos$Mutual_Information, vos$Probability)
  ovs_mi_mean <- weighted.mean(ovs$Mutual_Information, ovs$Probability)
  osv_mi_mean <- weighted.mean(osv$Mutual_Information, osv$Probability)
  
  tribble(
    ~word_order, ~score,
    "OVS", ovs_mi_mean,
    "SOV", sov_mi_mean,
    "OSV", osv_mi_mean,
    "VOS", vos_mi_mean,
    "VSO", vso_mi_mean,
    "SVO", svo_mi_mean
  ) %>% arrange(desc(score)) %>%
    mutate(language = df$language[[1]]) %>%
    mutate(measure = "mi") %>%
    mutate(rank = min_rank(desc(score)))
}

calcZScoreRankings <- function(df) {
  svo <- filter(df, Word_Order == "SVO")
  sov <- filter(df, Word_Order == "SOV")
  vso <- filter(df, Word_Order == "VSO")
  vos <- filter(df, Word_Order == "VOS")
  ovs <- filter(df, Word_Order == "OVS")
  osv <- filter(df, Word_Order == "OSV")
  
  svo_z_mean <- weighted.mean(svo$mi_z_score, svo$Probability)
  sov_z_mean <- weighted.mean(sov$mi_z_score, sov$Probability)
  vso_z_mean <- weighted.mean(vso$mi_z_score, vso$Probability)
  vos_z_mean <- weighted.mean(vos$mi_z_score, vos$Probability)
  ovs_z_mean <- weighted.mean(ovs$mi_z_score, ovs$Probability)
  osv_z_mean <- weighted.mean(osv$mi_z_score, osv$Probability)
  
  tribble(
    ~word_order, ~mi_z_score,
    "OVS", ovs_z_mean,
    "SOV", sov_z_mean,
    "OSV", osv_z_mean,
    "VOS", vos_z_mean,
    "VSO", vso_z_mean,
    "SVO", svo_z_mean
  ) %>% arrange(desc(mi_z_score)) %>%
    mutate(language = df$language[[1]])
}

calc_deterministic_percent <- function(df) {
  deterministic <- df %>% 
    filter(!str_detect(language, "subset")) %>% 
    group_by(Event) %>%
    mutate(Surprisal3 = as.double(Surprisal3)) %>% 
    summarise(det = min(Surprisal3)) %>% 
    filter(det == 0) %>%
    nrow
  tribble(
    ~language, ~prop,
    df$language[[1]], 100*deterministic/length(unique(df$Event))
  )
}

calc_deterministic_proportion <- function(df) {
  deterministic <- df %>% 
    filter(!str_detect(language, "subset")) %>%
    mutate(Surprisal3 = as.double(Surprisal3)) %>%
    mutate(det = if_else(.$Surprisal3 == 0, 1, 0)) %>% 
    select(Event, Word_Order, Surprisal3, det) %>% 
    group_by(Word_Order) %>% 
    summarise(prop = 100*sum(det)/length(unique(df$Event))) %>%
    mutate(language = df$language[[1]])
}

most_common_word_order <- function(df) {
  x <- select(df, SVO, SOV, VSO, VOS, OVS, OSV)
  colnames(x)[apply(x,1,which.max)]
}

calc_precision <- function(m, class) {
  true_pos <- class_accs %>%
    filter(measure == m, Classification == class) %>%
    select(acc) %>%
    sum
  false_pos <- class_accs %>% 
    filter(measure == m, word_order == class, Classification != class) %>%
    nrow
  returnValue(true_pos/(true_pos+false_pos))
}

calc_recall <- function(m, class) {
  true_pos <- class_accs %>%
    filter(measure == m, Classification == class) %>%
    select(acc) %>%
    sum
  returnValue(true_pos/(unique(select(filter(class_accs, measure == m, Classification == class), language, acc)$language) %>% length))
}

z_score <- function(df) {
  mean_mi <- mean(df$Mutual_Information)
  sd_mi <- sd(df$Mutual_Information)
  df %>% mutate(mi_z_score = (Mutual_Information-mean_mi)/sd_mi)
}

get_legend<-function(myggplot){
  tmp <- ggplot_gtable(ggplot_build(myggplot))
  leg <- which(sapply(tmp$grobs, function(x) x$name) == "guide-box")
  legend <- tmp$grobs[[leg]]
  return(legend)
}

################### load data #######################################

meta <- read_csv("metadata/language metadata.csv")
childes <- read_csv("childes_brown-results.csv") %>%
  mutate(language = "English CHILDES")

breton <- read_csv("ud_bre-results-excl_singletons.csv") %>%
  mutate(language = "Breton")

welsh <- read_csv("ud_cym-results-excl_singletons.csv") %>%
  mutate(language = "Welsh")

german <- read_csv("ud_deu-results-excl_singletons.csv") %>%
  mutate(language = "German")

english <- read_csv("ud_eng-results-excl_singletons.csv") %>%
  mutate(language = "English")

basque <- read_csv("ud_eus-results-excl_singletons.csv") %>%
  mutate(language = "Basque")

irish <- read_csv("ud_gae-results-excl_singletons.csv") %>%
  mutate(language = "Irish")

hindi <- read_csv("ud_hin-results-excl_singletons.csv") %>%
  mutate(language = "Hindi")

hungarian <- read_csv("ud_hun-results-excl_singletons.csv") %>%
  mutate(I2 = as.double(I2), language = "Hungarian")

indonesian <- read_csv("ud_ind-results-excl_singletons.csv") %>%
  mutate(language = "Indonesian")

japanese <- read_csv("ud_ja-results-excl_singletons.csv") %>%
  mutate(I2 = as.double(I2), language = "Japanese")

korean <- read_csv("ud_kor-results-excl_singletons.csv") %>%
  mutate(language = "Korean")

mbya_guarani <- read_csv("ud_mgu-results-excl_singletons.csv") %>%
  mutate(language = "Mbya Guarani")

dutch <- read_csv("ud_ned-results-excl_singletons.csv") %>%
  mutate(language = "Dutch")

tagalog <- read_csv("ud_tag-results-excl_singletons.csv") %>%
  mutate(language = "Tagalog")

turkish <- read_csv("ud_tur-results-excl_singletons.csv") %>%
  mutate(language = "Turkish")

vietnamese <- read_csv("ud_vie-results-excl_singletons.csv") %>%
  mutate(I2 = as.double(I2), language = "Vietnamese")

warlpiri <- read_csv("ud_war-results-excl_singletons.csv") %>%
  mutate(language = "Warlpiri")

wolof <- read_csv("ud_wol-results-excl_singletons.csv") %>%
  mutate(language = "Wolof")

mandarin <- read_csv("ud_zho-results-excl_singletons.csv") %>%
  mutate(language = "Mandarin")

langs <- list(basque, breton, dutch, english, german, hindi, hungarian, indonesian, irish, 
              japanese, korean, mandarin, mbya_guarani, scottish_gaelic, tagalog,
              turkish, vietnamese, warlpiri, welsh, wolof)

# calculate how many deterministic utterances there are in each language, 
#   first out of all utterances in all orders, second as a proportion by utterances within each word order
percent_deterministic_utts <- map_df(langs, calc_deterministic_percent)
proportion_deterministic_utts_by_wo <- map_df(langs, calc_deterministic_proportion)

# put all language data in a giant table with some appropriate metadata
big_table_o_data <- tribble(
  ~language, ~measure, ~word_order, ~score, ~rank
) %>%
  bind_rows(map_df(langs, function(df) {
    bind_rows(calcEntRankings(filter(df, !str_detect(language, "subset"))), 
              calcSurpRankings(filter(df, !str_detect(language, "subset"))),
              calcMIRankings(filter(df, !str_detect(language, "subset"))))
  }))

# these next few chunks of code calculate the accuracy of each measure in correctly predicting the dominant/most frequent word order in the 20 langs tested
class_accs <- left_join(filter(big_table_o_data, rank == 1), rename(meta, language = Language), big_table_o_data, by = "language") %>%
  mutate(acc = as.integer(word_order == Classification))

prediction_accuracies_class <- tribble(
  ~ent_uid, ~surp_uid, ~mi,
  sum(filter(class_accs, measure == "entropy UID")$acc), sum(filter(class_accs, measure == "surprisal UID")$acc), sum(filter(class_accs, measure == "mi")$acc)
)

count_accs <- left_join(filter(big_table_o_data, rank == 1), rename(mutate(meta, most_common = most_common_word_order(meta)), language = Language), big_table_o_data, by = "language") %>%
  mutate(acc = as.integer(word_order == most_common))

prediction_accuracies_counts <- tribble(
  ~ent_uid, ~surp_uid, ~mi,
  sum(filter(count_accs, measure == "entropy UID")$acc), sum(filter(count_accs, measure == "surprisal UID")$acc), sum(filter(count_accs, measure == "mi")$acc)
)

######################### calculate rankings ##########################################

# consolidate a confusion matrix for each measure on their ability to correctly classify the dominant/most frequent word order in the 20 langs tested
(confusion_matrix <- tribble(
  ~measure, ~svo_precision, ~svo_recall, ~sov_precision, ~sov_recall, ~vso_precision, ~vso_recall,
  "entropy UID", 100*calc_precision(m = "entropy UID", class = "SVO"), 100*calc_recall(m = "entropy UID", class = "SVO"), 100*calc_precision(m = "entropy UID", class = "SOV"), 100*calc_recall(m = "entropy UID", class = "SOV"), 100*calc_precision(m = "entropy UID", class = "VSO"), 100*calc_recall(m = "entropy UID", class = "VSO"),
  "surprisal UID", 100*calc_precision(m = "surprisal UID", class = "SVO"), 100*calc_recall(m = "surprisal UID", class = "SVO"), 100*calc_precision(m = "surprisal UID", class = "SOV"), 100*calc_recall(m = "surprisal UID", class = "SOV"), 100*calc_precision(m = "surprisal UID", class = "VSO"), 100*calc_recall(m = "surprisal UID", class = "VSO"),
  "mi", 100*calc_precision(m = "mi", class = "SVO"), 100*calc_recall(m = "mi", class = "SVO"), 100*calc_precision(m = "mi", class = "SOV"), 100*calc_recall(m = "mi", class = "SOV"), 100*calc_precision(m = "mi", class = "VSO"), 100*calc_recall(m = "mi", class = "VSO")
))

# calculate grad means across all 20 langs for each word order for the entropy-based UID measure
svo_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "SVO") %>% select(score) %>% summarize(avg = mean(score))
sov_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "SOV") %>% select(score) %>% summarize(avg = mean(score))
vso_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "VSO") %>% select(score) %>% summarize(avg = mean(score))
vos_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "VOS") %>% select(score) %>% summarize(avg = mean(score))
ovs_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "OVS") %>% select(score) %>% summarize(avg = mean(score))
osv_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "OSV") %>% select(score) %>% summarize(avg = mean(score))

# output table of entropy-based UID rankings
(agg_eng_ranking <- tribble(
  ~word_order, ~score,
  "OVS", ovs_agg_ent[[1]],
  "SOV", sov_agg_ent[[1]],
  "OSV", osv_agg_ent[[1]],
  "VOS", vos_agg_ent[[1]],
  "VSO", vso_agg_ent[[1]],
  "SVO", svo_agg_ent[[1]]
) %>% arrange(score) %>%
    mutate(rank = min_rank(score)))

# calculate grad means across all 20 langs for each word order for the surprisal-based UID measure
svo_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "SVO") %>% select(score) %>% summarize(avg = mean(score))
sov_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "SOV") %>% select(score) %>% summarize(avg = mean(score))
vso_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "VSO") %>% select(score) %>% summarize(avg = mean(score))
vos_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "VOS") %>% select(score) %>% summarize(avg = mean(score))
ovs_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "OVS") %>% select(score) %>% summarize(avg = mean(score))
osv_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "OSV") %>% select(score) %>% summarize(avg = mean(score))

# output table of surprisal-based UID rankings
(agg_surp_ranking <- tribble(
  ~word_order, ~score,
  "OVS", ovs_agg_surp[[1]],
  "SOV", sov_agg_surp[[1]],
  "OSV", osv_agg_surp[[1]],
  "VOS", vos_agg_surp[[1]],
  "VSO", vso_agg_surp[[1]],
  "SVO", svo_agg_surp[[1]]
) %>% arrange(score) %>%
    mutate(rank = min_rank(score)))

# z-score the pmi values within each language
z_scores <- tribble(
  ~language, ~word_order, ~score
) %>% bind_rows(map_df(langs, function(df) {
  rename(filter(df, !str_detect(language, "subset")) %>%
           z_score %>% 
           calcZScoreRankings, score = mi_z_score)
}))

# calculate grad means across all 20 langs for each word order for the pmi measure
svo_agg_mi <- z_scores %>% filter(word_order == "SVO") %>% select(score) %>% summarize(avg = mean(score))
sov_agg_mi <- z_scores %>% filter(word_order == "SOV") %>% select(score) %>% summarize(avg = mean(score))
vso_agg_mi <- z_scores %>% filter(word_order == "VSO") %>% select(score) %>% summarize(avg = mean(score))
vos_agg_mi <- z_scores %>% filter(word_order == "VOS") %>% select(score) %>% summarize(avg = mean(score))
ovs_agg_mi <- z_scores %>% filter(word_order == "OVS") %>% select(score) %>% summarize(avg = mean(score))
osv_agg_mi <- z_scores %>% filter(word_order == "OSV") %>% select(score) %>% summarize(avg = mean(score))

# output table of pmi rankings
(agg_pmi_rankingtribble(
  ~word_order, ~score,
  "OVS", ovs_agg_mi[[1]],
  "SOV", sov_agg_mi[[1]],
  "OSV", osv_agg_mi[[1]],
  "VOS", vos_agg_mi[[1]],
  "VSO", vso_agg_mi[[1]],
  "SVO", svo_agg_mi[[1]]
) %>% arrange(desc(score)))

# create a table to use for conducting one-way ANOVAs
anova_df <- big_table_o_data %>% 
  filter(language != "English CHILDES") %>%
  filter(measure == "entropy UID" | measure == "surprisal UID") %>%
  select(measure, word_order, score) %>%
  bind_rows(select(mutate(z_scores, measure = "mutual info"), measure, word_order, score)) %>%
  mutate(word_order = as.factor(word_order))

# one-way ANOVA for entropy-based UID measure, not assuming equal variance
oneway.test(score ~ word_order,
            data = filter(anova_df, measure == "entropy UID"),
            var.equal=FALSE)

# one-way ANOVA for surprisal-based UID measure, not assuming equal variance
oneway.test(score ~ word_order,
            data = filter(anova_df, measure == "surprisal UID"),
            var.equal=FALSE)

# one-way ANOVA for MI measure, not assuming equal variance
oneway.test(score ~ word_order,
            data = filter(anova_df, measure == "mutual info"),
            var.equal=FALSE)

# post-hoc Welch's t-tests for MI contrasts
t.test(x = filter(anova_df, measure == "mutual info", word_order == "SOV")$score, 
       y = filter(anova_df, measure == "mutual info", word_order == "VSO")$score, 
       var.equal = FALSE)

t.test(x = filter(anova_df, measure == "mutual info", word_order == "SOV")$score, 
       y = filter(anova_df, measure == "mutual info", word_order == "SVO")$score, 
       var.equal = FALSE)

t.test(x = filter(anova_df, measure == "mutual info", word_order == "VSO")$score, 
       y = filter(anova_df, measure == "mutual info", word_order == "SVO")$score, 
       var.equal = FALSE)

#################### data-viz stuff #################################################
                      
tb$order <- factor(tb$order, levels = c("SOV", "SVO", "VSO", "VOS", "OVS", "OSV"))
cbbPalette <- c("#000000", "#E69F00", "#56B4E9", "#009E73", "#F0E442", "#0072B2", "#D55E00", "#CC79A7")

toyworld <- read_csv("toyworld-results.csv") %>%
  mutate(I2 = as.double(I2)) %>%
  mutate(Surprisal2 = as.double(Surprisal2)) %>%
  mutate(Surprisal3 = as.double(Surprisal3))

tb2 <- bind_rows(arrange(toyworld %>% filter(Word_Order == "SOV" | Word_Order == "VOS"), Probability)[1:2,]) %>% 
  bind_rows(arrange(toyworld %>% filter(Word_Order == "SOV" | Word_Order == "VOS"), desc(Probability))[1:2,]) %>%
  select(Event, Word_Order, Probability, Eta0, Eta1, Eta2, Surprisal1, Surprisal2, Surprisal3) %>%
  mutate(normed_H1 = Eta1/Eta0, normed_H2 = Eta2/Eta0, normed_H0 = Eta0/Eta0, total_surp = Surprisal1+Surprisal2+Surprisal3)

(tw_eg <- tribble(
  ~event, ~order, ~word, ~entropy, ~surprisal, ~prob,
  # Eve eats bread, SOV
  tb2$Event[1], tb2$Word_Order[1], 0.015, tb2$normed_H0[1], 0, tb2$Probability[1],
  tb2$Event[1], tb2$Word_Order[1], 1.015, tb2$normed_H1[1], tb2$Surprisal1[1], tb2$Probability[1],
  tb2$Event[1], tb2$Word_Order[1], 2, tb2$normed_H2[1]+0.005, tb2$Surprisal2[1], tb2$Probability[1],
  tb2$Event[1], tb2$Word_Order[1], 3, 0.005, tb2$Surprisal3[1], tb2$Probability[1],
  # Eve eats bread, VOS
  tb2$Event[2], tb2$Word_Order[2], -0.015, tb2$normed_H0[2]-0.0005, 0, tb2$Probability[2],
  tb2$Event[2], tb2$Word_Order[2], 0.9825, tb2$normed_H1[2], tb2$Surprisal1[2], tb2$Probability[2],
  tb2$Event[2], tb2$Word_Order[2], 2, tb2$normed_H2[2], tb2$Surprisal2[2], tb2$Probability[2],
  tb2$Event[2], tb2$Word_Order[2], 3, 0, tb2$Surprisal3[2], tb2$Probability[2],
  "ideal_0.01", "SOV", 0, 1, 0, 0.01,
  "ideal_0.01", "SOV", 1, 2/3, tb2$total_surp[1]/3, 0.01,
  "ideal_0.01", "SOV", 2, 1/3, tb2$total_surp[1]/3, 0.01,
  "ideal_0.01", "SOV", 3, 0, tb2$total_surp[1]/3, 0.01,
  "ideal_0.01", "VOS", 0, 1, 0, 0.01,
  "ideal_0.01", "VOS", 1, 2/3, tb2$total_surp[2]/3, 0.01,
  "ideal_0.01", "VOS", 2, 1/3, tb2$total_surp[2]/3, 0.01,
  "ideal_0.01", "VOS", 3, 0, tb2$total_surp[2]/3, 0.01,
  # Eve eats rice, SOV
  tb2$Event[3], tb2$Word_Order[3], -0.015, tb2$normed_H0[3], 0, tb2$Probability[3],
  tb2$Event[3], tb2$Word_Order[3], 0.985, tb2$normed_H1[3], tb2$Surprisal1[3], tb2$Probability[3],
  tb2$Event[3], tb2$Word_Order[3], 1.99, tb2$normed_H2[3]-0.005, tb2$Surprisal2[3], tb2$Probability[3],
  tb2$Event[3], tb2$Word_Order[3], 3, -0.005, tb2$Surprisal3[3], tb2$Probability[3],
  # Eve eats rice, VOS
  tb2$Event[4], tb2$Word_Order[4], 0.015, tb2$normed_H0[4], 0, tb2$Probability[4],
  tb2$Event[4], tb2$Word_Order[4], 1.0175, tb2$normed_H1[4], tb2$Surprisal1[4], tb2$Probability[4],
  tb2$Event[4], tb2$Word_Order[4], 2, tb2$normed_H2[4], tb2$Surprisal2[4], tb2$Probability[4],
  tb2$Event[4], tb2$Word_Order[4], 3, 0, tb2$Surprisal3[4], tb2$Probability[4],
  "ideal_0.09", "SOV", 0, 1, 0, 0.09,
  "ideal_0.09", "SOV", 1, 2/3, tb2$total_surp[3]/3, 0.09,
  "ideal_0.09", "SOV", 2, 1/3, tb2$total_surp[3]/3, 0.09,
  "ideal_0.09", "SOV", 3, 0, tb2$total_surp[3]/3, 0.09,
  "ideal_0.09", "VOS", 0, 1, 0, 0.09,
  "ideal_0.09", "VOS", 1, 2/3, tb2$total_surp[4]/3, 0.09,
  "ideal_0.09", "VOS", 2, 1/3, tb2$total_surp[4]/3, 0.09,
  "ideal_0.09", "VOS", 3, 0, tb2$total_surp[4]/3, 0.09
))

# code to recreate the entropy example figure in the paper
fig2a <- filter(mutate(tw_eg, event = ifelse(event == "ideal_0.09" | event == "ideal_0.01", "ideal", event)), order == "SOV") %>% ggplot() + 
  geom_line(mapping = aes(x = word, y = entropy, linetype=event, color=event), size=2) +
  scale_x_continuous(name="Word", breaks = c(0,1,2,3), limits = c(-0.015,3), labels = c("pre-utterance", "Eve", "bread/rice", "ate")) +
  scale_linetype_discrete(labels = c("Eve ate bread,\n p(Event) = 0.01", "Eve ate rice,\n p(Event) = 0.09", "UID ideal")) +
  scale_color_manual(labels = c("Eve ate bread,\n p(Event) = 0.01", "Eve ate rice,\n p(Event) = 0.09", "UID ideal"), values = c("#000000", "#000000", "#CC79A7")) +
  scale_y_continuous(name = "Entropy", limits = c(-0.01,1), breaks = c(0, (1/3), 0.5, (2/3), 1), minor_breaks = c((1/6), (5/6)), labels = c("0", "0.33", "0.5", "0.67", "1")) +
  labs(color = "Event", linetype = "Event") +
  facet_wrap(~order) +
  theme(legend.position = "bottom",
        legend.key.width = unit(3, "lines"),
        legend.direction = "horizontal",
        text=element_text(size=24), 
        panel.background = element_rect(fill = "white", color = "grey"),
        panel.grid.major = element_line(color = "slategrey", size = 0.7),
        panel.grid.minor.y = element_line(color = "grey"),
        panel.grid.minor.x = element_line(color = "white"),
        axis.title.x = element_text(margin = margin(t = 6)),
        axis.title.y = element_text(margin = margin(r = 10)))

fig2_leg <- get_legend(fig2a)
  
fig2b <- filter(mutate(tw_eg, event = ifelse(event == "ideal_0.09" | event == "ideal_0.01", "ideal", event)), order == "VOS") %>% ggplot() + 
  geom_line(mapping = aes(x = word, y = entropy, linetype=event, color=event), size=2) +
  scale_x_continuous(name="Word", breaks = c(0,1,2,3), limits = c(-0.015,3), labels = c("pre-utterance", "ate", "bread/rice", "Eve")) +
  scale_linetype_discrete(labels = c("Eve ate bread,\n p(Event) = 0.01", "Eve ate rice,\n p(Event) = 0.09", "UID ideal")) +
  scale_color_manual(labels = c("Eve ate bread,\n p(Event) = 0.01", "Eve ate rice,\n p(Event) = 0.09", "UID ideal"), values = c("#000000", "#000000", "#CC79A7")) +
  scale_y_continuous(position = "right", limits = c(-0.01,1), breaks = c(0, (1/3), 0.5, (2/3), 1), minor_breaks = c((1/6), (5/6))) +
  labs(color = "Event", linetype = "Event") +
  facet_wrap(~order) +
  theme(legend.position = "none", 
        text=element_text(size=24), 
        panel.background = element_rect(fill = "white", color = "grey"),
        panel.grid.major = element_line(color = "slategrey", size = 0.7),
        panel.grid.minor.y = element_line(color = "grey"),
        panel.grid.minor.x = element_line(color = "white"),
        axis.title.x = element_text(margin = margin(t = 6)),
        axis.title.y = element_blank(),
        axis.text.y = element_blank())

(ent_fig <- grid.arrange(fig2a + 
               theme(legend.position = "none",
                     plot.margin = unit(c(0,1.75,0,1), "lines")), 
             fig2b + 
               theme(plot.margin = unit(c(0,1,0,1.75), "lines")), 
             fig2_leg, ncol = 2, nrow = 2, 
             layout_matrix = rbind(c(1,2), c(3,3)),
             heights = c(5, 1)))

# code to recreate the surprisal example figure in the paper
fig3a <- tw_eg %>% 
  mutate(w = c(0:3,0:3,0:3,0:3,0:3,0:3,0:3,0:3)) %>%
  filter(order == "SOV") %>% 
  ggplot() + 
  geom_line(mapping = aes(x = w, y = surprisal, linetype=event, color=event), size=2) + 
  scale_x_continuous(name="Word", breaks = c(1,2,3), limits = c(1,3), labels = c("Eve", "bread/rice", "ate")) +
  scale_y_continuous(name = "Surprisal", limits = c(0,4.5)) +
  scale_linetype_manual(labels = c("Eve ate bread, p(Event) = 0.01", "Eve ate rice, p(Event) = 0.09", "UID ideal for p(Event) = 0.01", "UID ideal for p(Event) = 0.09"), values = c("solid", "longdash", "dotdash", "dotted")) +
  scale_color_manual(labels = c("Eve ate bread, p(Event) = 0.01", "Eve ate rice, p(Event) = 0.09", "UID ideal for p(Event) = 0.01", "UID ideal for p(Event) = 0.09"), values = c("#56B4E9", "#56B4E9", "#CC79A7", "#CC79A7")) +
  labs(color = "Event", linetype = "Event") +
  facet_wrap(~order) +
  theme(legend.direction = "horizontal",
        legend.key = element_rect(size = 2.5),
        legend.key.width = unit(4.5, "lines"),
        text=element_text(size=24), 
        panel.background = element_rect(fill = "white", color = "grey"),
        panel.grid.major = element_line(color = "slategrey", size = 0.7),
        panel.grid.minor.y = element_line(color = "grey"),
        panel.grid.minor.x = element_line(color = "white"),
        axis.title.x = element_text(margin = margin(t = 6)),
        axis.title.y = element_text(margin = margin(r = 10))) +
  guides(linetype = guide_legend(ncol=2))

fig3_leg <- get_legend(fig3a)

fig3b <- tw_eg %>% 
  mutate(w = c(0:3,0:3,0:3,0:3,0:3,0:3,0:3,0:3)) %>%
  filter(order == "VOS") %>% 
  ggplot() + 
  geom_line(mapping = aes(x = w, y = surprisal, linetype=event, color=event), size=2) + 
  scale_x_continuous(name="Word", breaks = c(1,2,3), limits = c(1,3), labels = c("ate", "bread/rice", "Eve")) +
  scale_y_continuous(name = "Surprisal", limits = c(0,4.5)) +
  scale_linetype_manual(labels = c("Eve ate bread,\n p(Event) = 0.01", "Eve ate rice,\n p(Event) = 0.09", "UID ideal for p(Event) = 0.01", "UID ideal for p(Event) = 0.09"), values = c("solid", "longdash", "dotdash", "dotted")) +
  scale_color_manual(labels = c("Eve ate bread,\n p(Event) = 0.01", "Eve ate rice,\n p(Event) = 0.09", "UID ideal for p(Event) = 0.01", "UID ideal for p(Event) = 0.09"), values = c("#56B4E9", "#56B4E9", "#CC79A7", "#CC79A7")) +
  labs(color = "Event", linetype = "Event") +
  facet_wrap(~order) +
  theme(legend.position = "none", 
        text=element_text(size=24), 
        panel.background = element_rect(fill = "white", color = "grey"),
        panel.grid.major = element_line(color = "slategrey", size = 0.7),
        panel.grid.minor.y = element_line(color = "grey"),
        panel.grid.minor.x = element_line(color = "white"),
        axis.title.x = element_text(margin = margin(t = 6)),
        axis.title.y = element_blank(),
        axis.text.y = element_blank())

(surp_fig <- grid.arrange(fig3a + 
               theme(legend.position = "none",
                     plot.margin = unit(c(0,0.75,0,1), "lines")), 
             fig3b + 
               theme(plot.margin = unit(c(0,1,0,0.75), "lines")), 
             fig3_leg, ncol = 2, nrow = 2, 
             layout_matrix = rbind(c(1,2), c(3,3)),
             heights = c(5, 1.5)))

df <- tribble(
  ~measure, ~count, ~order,
  "WALS classification", 565, "SOV",
  "WALS classification", 488, "SVO",
  "WALS classification", 95, "VSO",
  "WALS classification", 25, "VOS",
  "WALS classification", 11, "OVS",
  "WALS classification", 4, "OSV",
  "entropy-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "entropy UID", word_order == "SOV")), "SOV",
  "entropy-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "entropy UID", word_order == "SVO")), "SVO",
  "entropy-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "entropy UID", word_order == "VSO")), "VSO",
  "entropy-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "entropy UID", word_order == "VOS")), "VOS",
  "entropy-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "entropy UID", word_order == "OVS")), "OVS",
  "entropy-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "entropy UID", word_order == "OSV")), "OSV",
  "surprisal-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "surprisal UID", word_order == "SOV")), "SOV",
  "surprisal-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "surprisal UID", word_order == "SVO")), "SVO",
  "surprisal-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "surprisal UID", word_order == "VSO")), "VSO",
  "surprisal-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "surprisal UID", word_order == "VOS")), "VOS",
  "surprisal-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "surprisal UID", word_order == "OVS")), "OVS",
  "surprisal-based UID", nrow(big_table_o_data %>% filter(rank == 1, measure == "surprisal UID", word_order == "OSV")), "OSV",
  "mutual information", nrow(big_table_o_data %>% filter(rank == 1, measure == "mi", word_order == "SOV")), "SOV",
  "mutual information", nrow(big_table_o_data %>% filter(rank == 1, measure == "mi", word_order == "SVO")), "SVO",
  "mutual information", nrow(big_table_o_data %>% filter(rank == 1, measure == "mi", word_order == "VSO")), "VSO",
  "mutual information", nrow(big_table_o_data %>% filter(rank == 1, measure == "mi", word_order == "VOS")), "VOS",
  "mutual information", nrow(big_table_o_data %>% filter(rank == 1, measure == "mi", word_order == "OVS")), "OVS",
  "mutual information", nrow(big_table_o_data %>% filter(rank == 1, measure == "mi", word_order == "OSV")), "OSV",
) %>%
  group_by(measure) %>% mutate(prop = count/sum(count))
df$order <- factor(df$order, levels = c("SOV", "SVO", "VSO", "VOS", "OVS", "OSV"))
df$measure <- factor(df$measure, levels = c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"))
                      
# code to recreate the WALS/entropy-based UID predictions/surprisal-based UID predictions/pmi predictions bar graph
ggplot(data = df, mapping = aes(x = order, y = prop, color=measure, fill=measure)) +
  geom_bar(stat = "identity", width = 0.65, position = position_dodge(width = 0.7)) +
  scale_color_manual(breaks=c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"), values=c(cbbPalette[4],cbbPalette[1],cbbPalette[3],cbbPalette[2])) +
  scale_fill_manual(breaks=c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"), values=c(cbbPalette[4],cbbPalette[1],cbbPalette[3],cbbPalette[2])) +
  scale_y_continuous(limits = c(0,0.5), breaks = c(0,0.1,0.2,0.3,0.4,0.5), labels = c("0", "10", "20", "30", "40", "50")) +
  labs(x = "Word order", y = "Proportion (%)", color = "Measure", fill="Measure") +
  theme(legend.position = c(0.82, 0.75),
        text=element_text(size=20), 
        panel.background = element_rect(fill = "white", color = "grey"),
        panel.grid.major = element_line(color = "slategrey", size = 0.7),
        panel.grid.minor.y = element_line(color = "grey"),
        panel.grid.minor.x = element_line(color = "white"),
        axis.title.x = element_text(margin = margin(t = 6)),
        axis.title.y = element_text(margin = margin(r = 10))) +
  guides(linetype=guide_legend(keywidth = 5.5, keyheight = 1))

# code to recreat the pointwise mutual information example graph in the paper
### NOTE: the euler function and the process of creating the VSO/OSV graph can be very fussy with aligning the circles in straight lines.
###  They may need to be run several times until the circles line up nicely
(eve_mi_eg <- tribble(
  ~event, ~order, ~words, ~mi, ~text_offset,
  "Eve ate bread", "SVO/OVS", "Eve ate", 0, 0,
  "Eve ate bread", "SVO/OVS", "ate bread", 1, 1.08,
  "Eve ate bread", "SOV/VOS", "Eve bread", 0, 0,
  "Eve ate bread", "SOV/VOS", "ate bread", 1, 1.08,
  "Eve ate bread", "VSO/OSV", "Eve ate", 0, 0.02,
  "Eve ate bread", "VSO/OSV", "Eve bread", 0, 0,
  "Eve ate rice", "SVO/OVS", "Eve ate", 0, 0,
  "Eve ate rice", "SVO/OVS", "ate rice", 1, -0.25,
  "Eve ate rice", "SOV/VOS", "Eve rice", log2(0.09/(0.2*0.23)), -0.22,
  "Eve ate rice", "SOV/VOS", "ate rice", 1, 0.6,
  "Eve ate rice", "VSO/OSV", "Eve ate", 0, 0,
  "Eve ate rice", "VSO/OSV", "Eve rice", log2(0.09/(0.2*0.23)), -0.22
  ))

  ents <- tribble(
  ~word, ~entropy,
  "Eve", -log2(0.2),
  "ate", -log2(0.5),
  "bread", -log2(0.05),
  "rice", -log2(0.23)
)

## SVO, bread
(svo_bread <- plot(euler(c("Eve" = filter(ents, word == "Eve") %>% .$entropy, 
             "ate" = filter(ents, word == "ate") %>% .$entropy, 
             "bread" = filter(ents, word == "bread") %>% .$entropy, 
             "ate&bread" = eve_mi_eg %>% filter(order == "SVO/OVS", words == "ate bread") %>% .$mi)), 
     fills = list(fill = c("white", "white", "white", "white", "white", "#E69F00"))))

## SVO, rice
(svo_rice <- plot(euler(c("Eve" = filter(ents, word == "Eve") %>% .$entropy, 
             "ate" = filter(ents, word == "ate") %>% .$entropy,
             "rice" = filter(ents, word == "rice") %>% .$entropy,
             "ate&rice" = eve_mi_eg %>% filter(order == "SVO/OVS", words == "ate rice") %>% .$mi)),
     fills = list(fill = c("white", "white", "white", "white", "white", "#E69F00"))))

## SOV, bread
(sov_bread <- plot(euler(c("Eve" = filter(ents, word == "Eve") %>% .$entropy,
             "bread" = filter(ents, word == "bread") %>% .$entropy,
             "ate" = filter(ents, word == "ate") %>% .$entropy,
             "bread&ate" = eve_mi_eg %>% filter(order == "SOV/VOS", words == "ate bread") %>% .$mi)),
     fills = list(fill = c("white", "white", "white", "white", "white", "#E69F00"))))
## SOV, rice
(sov_rice <- plot(euler(c("Eve" = filter(ents, word == "Eve") %>% .$entropy,
             "rice" = filter(ents, word == "rice") %>% .$entropy,
             "ate" = filter(ents, word == "ate") %>% .$entropy,
             "Eve&rice" = eve_mi_eg %>% filter(order == "SOV/VOS", words == "Eve rice") %>% .$mi,
             "rice&ate" = eve_mi_eg %>% filter(order == "SOV/VOS", words == "ate rice") %>% .$mi)),
     fills = list(fill = c("white", "white", "white", "#E69F00", "#E69F00" , "#E69F00"))))

## VSO, bread
#(vso_bread <- ggplot() +
#  geom_circle(data = filter(ents, word == "ate"), mapping = aes(x0 = 0, y0 = 0, r = sqrt(entropy/pi))) +
#  geom_text(mapping = aes(x = 0, y = 0, label = "ate"), size = 4.5, fontface = "bold") +
#  geom_circle(data = filter(ents, word == "Eve"), mapping = aes(x0 = 0.6+sqrt(entropy/pi), y0 = 0, r = sqrt(entropy/pi))) +
#  geom_text(data = filter(ents, word == "Eve"), mapping = aes(x = 0.6+sqrt(entropy/pi), y = 0, label = "Eve"), size = 4.5, fontface = "bold") +
#  geom_circle(data = filter(ents, word == "bread"), mapping = aes(x0 = 2.5+sqrt(entropy/pi), y0 = 0, r = sqrt(entropy/pi))) +
#  geom_text(data = filter(ents, word == "bread"), mapping = aes(x = 2.5+sqrt(entropy/pi), y = 0, label = "bread"), size = 4.5, fontface = "bold") +
#  coord_fixed(expand = FALSE) +
#  theme_void())

## VSO, rice
(vso_rice <- plot(euler(c("ate" = filter(ents, word == "ate") %>% .$entropy,
             "Eve" = filter(ents, word == "Eve") %>% .$entropy,
             "rice" = filter(ents, word == "rice") %>% .$entropy,
             "Eve&rice" = eve_mi_eg %>% filter(order == "VSO/OSV", words == "Eve rice") %>% .$mi)), 
     fills = list(fill = c("#ffffffff", "#ffffffff", "#ffffffff", "#ffffffff", "#ffffffff", "#E69F00"))))

(vso_bread <- plot(euler(c("ate" = filter(ents, word == "ate") %>% .$entropy,
                         "Eve" = filter(ents, word == "Eve") %>% .$entropy,
                         "bread" = filter(ents, word == "bread") %>% .$entropy,
                         "Eve&bread" = 0.0000000001,
             "ate&Eve" = 0.0000000001,
             "ate&bread" = 0)),
                 fills = list(fill = c("#ffffffff"))))

sov_title <- grobTree(rectGrob(gp = gpar(fill="#d9d9d9", col = "#d9d9d9")), textGrob("SOV/VOS", gp = gpar(fontsize=22, col="black"), just = "center"))
svo_title <- grobTree(rectGrob(gp = gpar(fill="#d9d9d9", col = "#d9d9d9")), textGrob("SVO/OVS", gp = gpar(fontsize=22, col="black"), just = "center"))
vso_title <- grobTree(rectGrob(gp = gpar(fill="#d9d9d9", col = "#d9d9d9")), textGrob("VSO/OSV", gp = gpar(fontsize=22, col="black", just = "center")))
bread_text <- grid.text(label = "Eve ate bread\np(Event = 0.01)", gp = gpar(fontsize = 18), hjust = "left")
rice_text <- grid.text(label = "Eve ate rice\np(Event = 0.09)", gp = gpar(fontsize = 18), hjust = "left")
line <- grid.lines(x = unit(c(2), "lines"), y = unit(c(0:17), "lines"), gp = gpar(lwd = 2, col = "grey"))
mi_leg <- get_legend(ggplot(eve_mi_eg) + 
                       geom_histogram(mapping = aes(x = order, y = mi, fill = "Amount of mutual information between two words"), stat = "identity") +
                       scale_fill_manual(values = c("#E69F00")) +
                       theme(legend.position = "bottom",
                             legend.title = element_blank(),
                             legend.text = element_text(size=18)))
spacer <- rectGrob(gp = gpar(col = "white"))

(pmi_fig <- grid.arrange(spacer, sov_title, svo_title, vso_title,
             rice_text,
             bread_text,
             line,
             sov_rice, sov_bread,
             line,
             svo_rice, svo_bread,
             line,
             vso_rice, vso_bread,
             mi_leg,
             line,
             nrow = 4, ncol = 14,
             widths = unit(c(6,3,1,8.5,2,3.25,2,10,0.1,3,9.75,2.25,0.75,1), "lines"),
             heights = unit(c(1.9,7.5,7.5,4), "lines"),
             layout_matrix = rbind(c(1,1,2,2,2,1,3,3,3,1,4,4,4,1),
                                  c(5,7,8,8,1,10,11,11,11,1,14,14,14,17), 
                                  c(6,7,9,9,9,10,12,12,13,1,15,15,1,17),
                                  c(16,16,16,16,16,16,16,16,16,16,16,16,16,16))))
