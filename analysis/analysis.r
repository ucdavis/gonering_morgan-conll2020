library(tidyverse)
library(ggplot2)
library(scales)
library(gridExtra)
library(ggrepel)
library(eulerr)
library(ggforce)
library(grid)

meta <- read_csv("metadata/language metadata.csv")
childes <- read_csv("childes_brown-results.csv") %>%
  mutate(language = "English CHILDES")

ancient_greek <- read_csv("ud_ael-results.csv") %>%
  mutate(language = "Ancient Greek") %>%
  bind_rows(read_csv("ud_ael-subset1-results.csv") %>% mutate(language = "Ancient Greek subset 1")) %>%
  bind_rows(read_csv("ud_ael-subset2-results.csv") %>% mutate(language = "Ancient Greek subset 2")) %>%
  bind_rows(read_csv("ud_ael-subset3-results.csv") %>% mutate(language = "Ancient Greek subset 3")) %>%
  bind_rows(read_csv("ud_ael-subset4-results.csv") %>% mutate(language = "Ancient Greek subset 4")) %>%
  bind_rows(read_csv("ud_ael-subset5-results.csv") %>% mutate(language = "Ancient Greek subset 5")) %>%
  bind_rows(read_csv("ud_ael-subset6-results.csv") %>% mutate(language = "Ancient Greek subset 6")) %>%
  bind_rows(read_csv("ud_ael-subset7-results.csv") %>% mutate(language = "Ancient Greek subset 7")) %>%
  bind_rows(read_csv("ud_ael-subset8-results.csv") %>% mutate(language = "Ancient Greek subset 8")) %>%
  bind_rows(read_csv("ud_ael-subset9-results.csv") %>% mutate(language = "Ancient Greek subset 9")) %>%
  bind_rows(read_csv("ud_ael-subset10-results.csv") %>% mutate(language = "Ancient Greek subset 10"))

afrikaans <- read_csv("ud_afr-results.csv") %>%
  mutate(language = "Afrikaans") %>%
  bind_rows(read_csv("ud_afr-subset1-results.csv") %>% mutate(language = "Afrikaans subset 1")) %>%
  bind_rows(read_csv("ud_afr-subset2-results.csv") %>% mutate(language = "Afrikaans subset 2")) %>%
  bind_rows(read_csv("ud_afr-subset3-results.csv") %>% mutate(language = "Afrikaans subset 3")) %>%
  bind_rows(read_csv("ud_afr-subset4-results.csv") %>% mutate(language = "Afrikaans subset 4")) %>%
  bind_rows(read_csv("ud_afr-subset5-results.csv") %>% mutate(language = "Afrikaans subset 5")) %>%
  bind_rows(read_csv("ud_afr-subset6-results.csv") %>% mutate(language = "Afrikaans subset 6")) %>%
  bind_rows(read_csv("ud_afr-subset7-results.csv") %>% mutate(language = "Afrikaans subset 7")) %>%
  bind_rows(read_csv("ud_afr-subset8-results.csv") %>% mutate(language = "Afrikaans subset 8")) %>%
  bind_rows(read_csv("ud_afr-subset9-results.csv") %>% mutate(language = "Afrikaans subset 9")) %>%
  bind_rows(read_csv("ud_afr-subset10-results.csv") %>% mutate(language = "Afrikaans subset 10"))

akkadian <- read_csv("ud_akk-results.csv") %>%
  mutate(language = "Akkadian")

amharic <- read_csv("ud_amh-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Amharic") %>%
  bind_rows(read_csv("ud_amh-subset1-results.csv") %>% mutate(language = "Amharic subset 1")) %>%
  bind_rows(read_csv("ud_amh-subset2-results.csv") %>% mutate(language = "Amharic subset 2")) %>%
  bind_rows(read_csv("ud_amh-subset3-results.csv") %>% mutate(language = "Amharic subset 3")) %>%
  bind_rows(read_csv("ud_amh-subset4-results.csv") %>% mutate(language = "Amharic subset 4")) %>%
  bind_rows(read_csv("ud_amh-subset5-results.csv") %>% mutate(language = "Amharic subset 5")) %>%
  bind_rows(read_csv("ud_amh-subset6-results.csv") %>% mutate(language = "Amharic subset 6")) %>%
  bind_rows(read_csv("ud_amh-subset7-results.csv") %>% mutate(language = "Amharic subset 7")) %>%
  bind_rows(read_csv("ud_amh-subset8-results.csv") %>% mutate(I2 = as.double(I2),language = "Amharic subset 8")) %>%
  bind_rows(read_csv("ud_amh-subset9-results.csv") %>% mutate(language = "Amharic subset 9")) %>%
  bind_rows(read_csv("ud_amh-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Amharic subset 10"))

arabic <- read_csv("ud_ara-results.csv") %>%
  mutate(language = "Arabic") %>%
  bind_rows(read_csv("ud_ara-subset1-results.csv") %>% mutate(language = "Arabic subset 1")) %>%
  bind_rows(read_csv("ud_ara-subset2-results.csv") %>% mutate(language = "Arabic subset 2")) %>%
  bind_rows(read_csv("ud_ara-subset3-results.csv") %>% mutate(language = "Arabic subset 3")) %>%
  bind_rows(read_csv("ud_ara-subset4-results.csv") %>% mutate(language = "Arabic subset 4")) %>%
  bind_rows(read_csv("ud_ara-subset5-results.csv") %>% mutate(language = "Arabic subset 5")) %>%
  bind_rows(read_csv("ud_ara-subset6-results.csv") %>% mutate(language = "Arabic subset 6")) %>%
  bind_rows(read_csv("ud_ara-subset7-results.csv") %>% mutate(language = "Arabic subset 7")) %>%
  bind_rows(read_csv("ud_ara-subset8-results.csv") %>% mutate(language = "Arabic subset 8")) %>%
  bind_rows(read_csv("ud_ara-subset9-results.csv") %>% mutate(language = "Arabic subset 9")) %>%
  bind_rows(read_csv("ud_ara-subset10-results.csv") %>% mutate(language = "Arabic subset 10"))

armenian <- read_csv("ud_arm-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Armenian") %>%
  bind_rows(read_csv("ud_arm-subset1-results.csv") %>% mutate(language = "Armenian subset 1")) %>%
  bind_rows(read_csv("ud_arm-subset2-results.csv") %>% mutate(language = "Armenian subset 2")) %>%
  bind_rows(read_csv("ud_arm-subset3-results.csv") %>% mutate(language = "Armenian subset 3")) %>%
  bind_rows(read_csv("ud_arm-subset4-results.csv") %>% mutate(language = "Armenian subset 4")) %>%
  bind_rows(read_csv("ud_arm-subset5-results.csv") %>% mutate(language = "Armenian subset 5")) %>%
  bind_rows(read_csv("ud_arm-subset6-results.csv") %>% mutate(language = "Armenian subset 6")) %>%
  bind_rows(read_csv("ud_arm-subset7-results.csv") %>% mutate(language = "Armenian subset 7")) %>%
  bind_rows(read_csv("ud_arm-subset8-results.csv") %>% mutate(language = "Armenian subset 8")) %>%
  bind_rows(read_csv("ud_arm-subset9-results.csv") %>% mutate(language = "Armenian subset 9")) %>%
  bind_rows(read_csv("ud_arm-subset10-results.csv") %>% mutate(language = "Armenian subset 10"))

bambara <- read_csv("ud_bam-results.csv") %>%
  mutate(language = "Bambara")

bhojpuri <- read_csv("ud_bho-results.csv") %>%
  mutate(language = "Bhojpuri")

breton <- read_csv("ud_bre-results-excl_singletons.csv") %>%
  mutate(language = "Breton")

belarusian <- read_csv("ud_bru-results.csv") %>%
  mutate(language = "Belarusian")

bulgarian <- read_csv("ud_bul-results.csv") %>%
  mutate(language = "Bulgarian") %>%
  bind_rows(read_csv("ud_bul-subset1-results.csv") %>% mutate(language = "Bulgarian subset 1")) %>%
  bind_rows(read_csv("ud_bul-subset2-results.csv") %>% mutate(language = "Bulgarian subset 2")) %>%
  bind_rows(read_csv("ud_bul-subset3-results.csv") %>% mutate(language = "Bulgarian subset 3")) %>%
  bind_rows(read_csv("ud_bul-subset4-results.csv") %>% mutate(language = "Bulgarian subset 4")) %>%
  bind_rows(read_csv("ud_bul-subset5-results.csv") %>% mutate(language = "Bulgarian subset 5")) %>%
  bind_rows(read_csv("ud_bul-subset6-results.csv") %>% mutate(language = "Bulgarian subset 6")) %>%
  bind_rows(read_csv("ud_bul-subset7-results.csv") %>% mutate(language = "Bulgarian subset 7")) %>%
  bind_rows(read_csv("ud_bul-subset8-results.csv") %>% mutate(language = "Bulgarian subset 8")) %>%
  bind_rows(read_csv("ud_bul-subset9-results.csv") %>% mutate(language = "Bulgarian subset 9")) %>%
  bind_rows(read_csv("ud_bul-subset10-results.csv") %>% mutate(language = "Bulgarian subset 10"))

buryat <- read_csv("ud_bur-results.csv") %>%
  mutate(language = "Buryat")

cantonese <- read_csv("ud_can-results.csv") %>%
  mutate(language = "Cantonese")

catalan <- read_csv("ud_cat-results.csv") %>%
  mutate(language = "Catalan") %>%
  bind_rows(read_csv("ud_cat-subset1-results.csv") %>% mutate(language = "Catalan subset 1")) %>%
  bind_rows(read_csv("ud_cat-subset2-results.csv") %>% mutate(language = "Catalan subset 2")) %>%
  bind_rows(read_csv("ud_cat-subset3-results.csv") %>% mutate(language = "Catalan subset 3")) %>%
  bind_rows(read_csv("ud_cat-subset4-results.csv") %>% mutate(language = "Catalan subset 4")) %>%
  bind_rows(read_csv("ud_cat-subset5-results.csv") %>% mutate(language = "Catalan subset 5")) %>%
  bind_rows(read_csv("ud_cat-subset6-results.csv") %>% mutate(language = "Catalan subset 6")) %>%
  bind_rows(read_csv("ud_cat-subset7-results.csv") %>% mutate(language = "Catalan subset 7")) %>%
  bind_rows(read_csv("ud_cat-subset8-results.csv") %>% mutate(language = "Catalan subset 8")) %>%
  bind_rows(read_csv("ud_cat-subset9-results.csv") %>% mutate(language = "Catalan subset 9")) %>%
  bind_rows(read_csv("ud_cat-subset10-results.csv") %>% mutate(language = "Catalan subset 10"))

classical_chinese <- read_csv("ud_cch-results.csv") %>%
  mutate(language = "Classical Chinese") %>%
  bind_rows(read_csv("ud_cch-subset1-results.csv") %>% mutate(language = "Classical Chinese subset 1")) %>%
  bind_rows(read_csv("ud_cch-subset2-results.csv") %>% mutate(language = "Classical Chinese subset 2")) %>%
  bind_rows(read_csv("ud_cch-subset3-results.csv") %>% mutate(language = "Classical Chinese subset 3")) %>%
  bind_rows(read_csv("ud_cch-subset4-results.csv") %>% mutate(language = "Classical Chinese subset 4")) %>%
  bind_rows(read_csv("ud_cch-subset5-results.csv") %>% mutate(language = "Classical Chinese subset 5")) %>%
  bind_rows(read_csv("ud_cch-subset6-results.csv") %>% mutate(language = "Classical Chinese subset 6")) %>%
  bind_rows(read_csv("ud_cch-subset7-results.csv") %>% mutate(language = "Classical Chinese subset 7")) %>%
  bind_rows(read_csv("ud_cch-subset8-results.csv") %>% mutate(language = "Classical Chinese subset 8")) %>%
  bind_rows(read_csv("ud_cch-subset9-results.csv") %>% mutate(language = "Classical Chinese subset 9")) %>%
  bind_rows(read_csv("ud_cch-subset10-results.csv") %>% mutate(language = "Classical Chinese subset 10"))

coptic <- read_csv("ud_cop-results.csv") %>%
  mutate(language = "Coptic") %>%
  bind_rows(read_csv("ud_cop-subset1-results.csv") %>% mutate(language = "Coptic subset 1")) %>%
  bind_rows(read_csv("ud_cop-subset2-results.csv") %>% mutate(language = "Coptic subset 2")) %>%
  bind_rows(read_csv("ud_cop-subset3-results.csv") %>% mutate(language = "Coptic subset 3")) %>%
  bind_rows(read_csv("ud_cop-subset4-results.csv") %>% mutate(language = "Coptic subset 4")) %>%
  bind_rows(read_csv("ud_cop-subset5-results.csv") %>% mutate(language = "Coptic subset 5")) %>%
  bind_rows(read_csv("ud_cop-subset6-results.csv") %>% mutate(language = "Coptic subset 6")) %>%
  bind_rows(read_csv("ud_cop-subset7-results.csv") %>% mutate(language = "Coptic subset 7")) %>%
  bind_rows(read_csv("ud_cop-subset8-results.csv") %>% mutate(language = "Coptic subset 8")) %>%
  bind_rows(read_csv("ud_cop-subset9-results.csv") %>% mutate(language = "Coptic subset 9")) %>%
  bind_rows(read_csv("ud_cop-subset10-results.csv") %>% mutate(language = "Coptic subset 10"))

croatian <- read_csv("ud_cro-results.csv") %>%
  mutate(language = "Croatian") %>%
  bind_rows(read_csv("ud_cro-subset1-results.csv") %>% mutate(language = "Croatian subset 1")) %>%
  bind_rows(read_csv("ud_cro-subset2-results.csv") %>% mutate(language = "Croatian subset 2")) %>%
  bind_rows(read_csv("ud_cro-subset3-results.csv") %>% mutate(language = "Croatian subset 3")) %>%
  bind_rows(read_csv("ud_cro-subset4-results.csv") %>% mutate(language = "Croatian subset 4")) %>%
  bind_rows(read_csv("ud_cro-subset5-results.csv") %>% mutate(language = "Croatian subset 5")) %>%
  bind_rows(read_csv("ud_cro-subset6-results.csv") %>% mutate(language = "Croatian subset 6")) %>%
  bind_rows(read_csv("ud_cro-subset7-results.csv") %>% mutate(language = "Croatian subset 7")) %>%
  bind_rows(read_csv("ud_cro-subset8-results.csv") %>% mutate(language = "Croatian subset 8")) %>%
  bind_rows(read_csv("ud_cro-subset9-results.csv") %>% mutate(language = "Croatian subset 9")) %>%
  bind_rows(read_csv("ud_cro-subset10-results.csv") %>% mutate(language = "Croatian subset 10"))

welsh <- read_csv("ud_cym-results-excl_singletons.csv") %>%
  mutate(language = "Welsh")

czech <- read_csv("ud_cze-results.csv") %>%
  mutate(language = "Czech") %>%
  bind_rows(read_csv("ud_cze-subset1-results.csv") %>% mutate(language = "Czech subset 1")) %>%
  bind_rows(read_csv("ud_cze-subset2-results.csv") %>% mutate(language = "Czech subset 2")) %>%
  bind_rows(read_csv("ud_cze-subset3-results.csv") %>% mutate(language = "Czech subset 3")) %>%
  bind_rows(read_csv("ud_cze-subset4-results.csv") %>% mutate(language = "Czech subset 4")) %>%
  bind_rows(read_csv("ud_cze-subset5-results.csv") %>% mutate(language = "Czech subset 5")) %>%
  bind_rows(read_csv("ud_cze-subset6-results.csv") %>% mutate(language = "Czech subset 6")) %>%
  bind_rows(read_csv("ud_cze-subset7-results.csv") %>% mutate(language = "Czech subset 7")) %>%
  bind_rows(read_csv("ud_cze-subset8-results.csv") %>% mutate(language = "Czech subset 8")) %>%
  bind_rows(read_csv("ud_cze-subset9-results.csv") %>% mutate(language = "Czech subset 9")) %>%
  bind_rows(read_csv("ud_cze-subset10-results.csv") %>% mutate(language = "Czech subset 10"))

danish <- read_csv("ud_dan-results.csv") %>%
  mutate(language = "Danish") %>%
  bind_rows(read_csv("ud_dan-subset1-results.csv") %>% mutate(language = "Danish subset 1")) %>%
  bind_rows(read_csv("ud_dan-subset2-results.csv") %>% mutate(language = "Danish subset 2")) %>%
  bind_rows(read_csv("ud_dan-subset3-results.csv") %>% mutate(language = "Danish subset 3")) %>%
  bind_rows(read_csv("ud_dan-subset4-results.csv") %>% mutate(language = "Danish subset 4")) %>%
  bind_rows(read_csv("ud_dan-subset5-results.csv") %>% mutate(language = "Danish subset 5")) %>%
  bind_rows(read_csv("ud_dan-subset6-results.csv") %>% mutate(language = "Danish subset 6")) %>%
  bind_rows(read_csv("ud_dan-subset7-results.csv") %>% mutate(language = "Danish subset 7")) %>%
  bind_rows(read_csv("ud_dan-subset8-results.csv") %>% mutate(language = "Danish subset 8")) %>%
  bind_rows(read_csv("ud_dan-subset9-results.csv") %>% mutate(language = "Danish subset 9")) %>%
  bind_rows(read_csv("ud_dan-subset10-results.csv") %>% mutate(language = "Danish subset 10"))

german <- read_csv("ud_deu-results-excl_singletons.csv") %>%
  mutate(language = "German") # %>%
  bind_rows(read_csv("ud_deu-subset1-results.csv") %>% mutate(language = "German subset 1")) %>%
  bind_rows(read_csv("ud_deu-subset2-results.csv") %>% mutate(language = "German subset 2")) %>%
  bind_rows(read_csv("ud_deu-subset3-results.csv") %>% mutate(language = "German subset 3")) %>%
  bind_rows(read_csv("ud_deu-subset4-results.csv") %>% mutate(language = "German subset 4")) %>%
  bind_rows(read_csv("ud_deu-subset5-results.csv") %>% mutate(language = "German subset 5")) %>%
  bind_rows(read_csv("ud_deu-subset6-results.csv") %>% mutate(language = "German subset 6")) %>%
  bind_rows(read_csv("ud_deu-subset7-results.csv") %>% mutate(language = "German subset 7")) %>%
  bind_rows(read_csv("ud_deu-subset8-results.csv") %>% mutate(language = "German subset 8")) %>%
  bind_rows(read_csv("ud_deu-subset9-results.csv") %>% mutate(language = "German subset 9")) %>%
  bind_rows(read_csv("ud_deu-subset10-results.csv") %>% mutate(language = "German subset 10"))

greek <- read_csv("ud_ell-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Modern Greek") %>%
  bind_rows(read_csv("ud_ell-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 1")) %>%
  bind_rows(read_csv("ud_ell-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 2")) %>%
  bind_rows(read_csv("ud_ell-subset3-results.csv") %>% mutate(language = "Greek subset 3")) %>%
  bind_rows(read_csv("ud_ell-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 4")) %>%
  bind_rows(read_csv("ud_ell-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 5")) %>%
  bind_rows(read_csv("ud_ell-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 6")) %>%
  bind_rows(read_csv("ud_ell-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 7")) %>%
  bind_rows(read_csv("ud_ell-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 8")) %>%
  bind_rows(read_csv("ud_ell-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 9")) %>%
  bind_rows(read_csv("ud_ell-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Modern Greek subset 10"))

english <- read_csv("ud_eng-results-excl_singletons.csv") %>%
  mutate(language = "English") # %>%
  bind_rows(read_csv("ud_eng-subset1-results.csv") %>% mutate(language = "English subset 1")) %>%
  bind_rows(read_csv("ud_eng-subset2-results.csv") %>% mutate(language = "English subset 2")) %>%
  bind_rows(read_csv("ud_eng-subset3-results.csv") %>% mutate(language = "English subset 3")) %>%
  bind_rows(read_csv("ud_eng-subset4-results.csv") %>% mutate(language = "English subset 4")) %>%
  bind_rows(read_csv("ud_eng-subset5-results.csv") %>% mutate(language = "English subset 5")) %>%
  bind_rows(read_csv("ud_eng-subset6-results.csv") %>% mutate(language = "English subset 6")) %>%
  bind_rows(read_csv("ud_eng-subset7-results.csv") %>% mutate(language = "English subset 7")) %>%
  bind_rows(read_csv("ud_eng-subset8-results.csv") %>% mutate(language = "English subset 8")) %>%
  bind_rows(read_csv("ud_eng-subset9-results.csv") %>% mutate(language = "English subset 9")) %>%
  bind_rows(read_csv("ud_eng-subset10-results.csv") %>% mutate(language = "English subset 10"))

erzya <- read_csv("ud_erz-results.csv") %>%
  mutate(language = "Erzya")

estonian <- read_csv("ud_est-results.csv") %>%
  mutate(language = "Estonian") %>%
  bind_rows(read_csv("ud_est-subset1-results.csv") %>% mutate(language = "Estonian subset 1")) %>%
  bind_rows(read_csv("ud_est-subset2-results.csv") %>% mutate(language = "Estonian subset 2")) %>%
  bind_rows(read_csv("ud_est-subset3-results.csv") %>% mutate(language = "Estonian subset 3")) %>%
  bind_rows(read_csv("ud_est-subset4-results.csv") %>% mutate(language = "Estonian subset 4")) %>%
  bind_rows(read_csv("ud_est-subset5-results.csv") %>% mutate(language = "Estonian subset 5")) %>%
  bind_rows(read_csv("ud_est-subset6-results.csv") %>% mutate(language = "Estonian subset 6")) %>%
  bind_rows(read_csv("ud_est-subset7-results.csv") %>% mutate(language = "Estonian subset 7")) %>%
  bind_rows(read_csv("ud_est-subset8-results.csv") %>% mutate(language = "Estonian subset 8")) %>%
  bind_rows(read_csv("ud_est-subset9-results.csv") %>% mutate(language = "Estonian subset 9")) %>%
  bind_rows(read_csv("ud_est-subset10-results.csv") %>% mutate(language = "Estonian subset 10"))

basque <- read_csv("ud_eus-results-excl_singletons.csv") %>%
  mutate(language = "Basque") # %>%
  bind_rows(read_csv("ud_eus-subset1-results.csv") %>% mutate(language = "Basque subset 1")) %>%
  bind_rows(read_csv("ud_eus-subset2-results.csv") %>% mutate(language = "Basque subset 2")) %>%
  bind_rows(read_csv("ud_eus-subset3-results.csv") %>% mutate(language = "Basque subset 3")) %>%
  bind_rows(read_csv("ud_eus-subset4-results.csv") %>% mutate(language = "Basque subset 4")) %>%
  bind_rows(read_csv("ud_eus-subset5-results.csv") %>% mutate(language = "Basque subset 5")) %>%
  bind_rows(read_csv("ud_eus-subset6-results.csv") %>% mutate(language = "Basque subset 6")) %>%
  bind_rows(read_csv("ud_eus-subset7-results.csv") %>% mutate(language = "Basque subset 7")) %>%
  bind_rows(read_csv("ud_eus-subset8-results.csv") %>% mutate(language = "Basque subset 8")) %>%
  bind_rows(read_csv("ud_eus-subset9-results.csv") %>% mutate(language = "Basque subset 9")) %>%
  bind_rows(read_csv("ud_eus-subset10-results.csv") %>% mutate(language = "Basque subset 10"))

farsi <- read_csv("ud_far-results.csv") %>%
  mutate(language = "Farsi")

finnish <- read_csv("ud_fin-results.csv") %>%
  mutate(language = "Finnish") %>%
  bind_rows(read_csv("ud_fin-subset1-results.csv") %>% mutate(language = "Finnish subset 1")) %>%
  bind_rows(read_csv("ud_fin-subset2-results.csv") %>% mutate(language = "Finnish subset 2")) %>%
  bind_rows(read_csv("ud_fin-subset3-results.csv") %>% mutate(language = "Finnish subset 3")) %>%
  bind_rows(read_csv("ud_fin-subset4-results.csv") %>% mutate(language = "Finnish subset 4")) %>%
  bind_rows(read_csv("ud_fin-subset5-results.csv") %>% mutate(language = "Finnish subset 5")) %>%
  bind_rows(read_csv("ud_fin-subset6-results.csv") %>% mutate(language = "Finnish subset 6")) %>%
  bind_rows(read_csv("ud_fin-subset7-results.csv") %>% mutate(language = "Finnish subset 7")) %>%
  bind_rows(read_csv("ud_fin-subset8-results.csv") %>% mutate(language = "Finnish subset 8")) %>%
  bind_rows(read_csv("ud_fin-subset9-results.csv") %>% mutate(language = "Finnish subset 9")) %>%
  bind_rows(read_csv("ud_fin-subset10-results.csv") %>% mutate(language = "Finnish subset 10"))

french <- read_csv("ud_fre-results.csv") %>%
  mutate(language = "French") %>%
  bind_rows(read_csv("ud_fre-subset1-results.csv") %>% mutate(language = "French subset 1")) %>%
  bind_rows(read_csv("ud_fre-subset2-results.csv") %>% mutate(language = "French subset 2")) %>%
  bind_rows(read_csv("ud_fre-subset3-results.csv") %>% mutate(language = "French subset 3")) %>%
  bind_rows(read_csv("ud_fre-subset4-results.csv") %>% mutate(language = "French subset 4")) %>%
  bind_rows(read_csv("ud_fre-subset5-results.csv") %>% mutate(language = "French subset 5")) %>%
  bind_rows(read_csv("ud_fre-subset6-results.csv") %>% mutate(language = "French subset 6")) %>%
  bind_rows(read_csv("ud_fre-subset7-results.csv") %>% mutate(language = "French subset 7")) %>%
  bind_rows(read_csv("ud_fre-subset8-results.csv") %>% mutate(language = "French subset 8")) %>%
  bind_rows(read_csv("ud_fre-subset9-results.csv") %>% mutate(language = "French subset 9")) %>%
  bind_rows(read_csv("ud_fre-subset10-results.csv") %>% mutate(language = "French subset 10"))

faroese <- read_csv("ud_fro-results.csv") %>%
  mutate(language = "Faroese")

irish <- read_csv("ud_gae-results-excl_singletons.csv") %>%
  mutate(language = "Irish")

scottish_gaelic <- read_csv("ud_gai-results-excl_singletons.csv") %>%
  mutate(language = "Scottish Gaelic")

galician <- read_csv("ud_gal-results.csv") %>%
  mutate(language = "Galician") %>%
  bind_rows(read_csv("ud_gal-subset1-results.csv") %>% mutate(language = "Galician subset 1")) %>%
  bind_rows(read_csv("ud_gal-subset2-results.csv") %>% mutate(language = "Galician subset 2")) %>%
  bind_rows(read_csv("ud_gal-subset3-results.csv") %>% mutate(language = "Galician subset 3")) %>%
  bind_rows(read_csv("ud_gal-subset4-results.csv") %>% mutate(language = "Galician subset 4")) %>%
  bind_rows(read_csv("ud_gal-subset5-results.csv") %>% mutate(language = "Galician subset 5")) %>%
  bind_rows(read_csv("ud_gal-subset6-results.csv") %>% mutate(language = "Galician subset 6")) %>%
  bind_rows(read_csv("ud_gal-subset7-results.csv") %>% mutate(language = "Galician subset 7")) %>%
  bind_rows(read_csv("ud_gal-subset8-results.csv") %>% mutate(language = "Galician subset 8")) %>%
  bind_rows(read_csv("ud_gal-subset9-results.csv") %>% mutate(language = "Galician subset 9")) %>%
  bind_rows(read_csv("ud_gal-subset10-results.csv") %>% mutate(language = "Galician subset 10"))

gothic <- read_csv("ud_got-results.csv") %>%
  mutate(language = "Gothic") %>%
  bind_rows(read_csv("ud_got-subset1-results.csv") %>% mutate(language = "Gothic subset 1")) %>%
  bind_rows(read_csv("ud_got-subset2-results.csv") %>% mutate(language = "Gothic subset 2")) %>%
  bind_rows(read_csv("ud_got-subset3-results.csv") %>% mutate(language = "Gothic subset 3")) %>%
  bind_rows(read_csv("ud_got-subset4-results.csv") %>% mutate(language = "Gothic subset 4")) %>%
  bind_rows(read_csv("ud_got-subset5-results.csv") %>% mutate(language = "Gothic subset 5")) %>%
  bind_rows(read_csv("ud_got-subset6-results.csv") %>% mutate(language = "Gothic subset 6")) %>%
  bind_rows(read_csv("ud_got-subset7-results.csv") %>% mutate(language = "Gothic subset 7")) %>%
  bind_rows(read_csv("ud_got-subset8-results.csv") %>% mutate(language = "Gothic subset 8")) %>%
  bind_rows(read_csv("ud_got-subset9-results.csv") %>% mutate(language = "Gothic subset 9")) %>%
  bind_rows(read_csv("ud_got-subset10-results.csv") %>% mutate(language = "Gothic subset 10"))

hebrew <- read_csv("ud_heb-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Hebrew") %>%
  bind_rows(read_csv("ud_heb-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 1")) %>%
  bind_rows(read_csv("ud_heb-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 2")) %>%
  bind_rows(read_csv("ud_heb-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 3")) %>%
  bind_rows(read_csv("ud_heb-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 4")) %>%
  bind_rows(read_csv("ud_heb-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 5")) %>%
  bind_rows(read_csv("ud_heb-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 6")) %>%
  bind_rows(read_csv("ud_heb-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 7")) %>%
  bind_rows(read_csv("ud_heb-subset8-results.csv") %>% mutate(language = "Hebrew subset 8")) %>%
  bind_rows(read_csv("ud_heb-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 9")) %>%
  bind_rows(read_csv("ud_heb-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Hebrew subset 10"))

hindi <- read_csv("ud_hin-results-excl_singletons.csv") %>%
  mutate(language = "Hindi") # %>%
  bind_rows(read_csv("ud_hin-subset1-results.csv") %>% mutate(language = "Hindi subset 1")) %>%
  bind_rows(read_csv("ud_hin-subset2-results.csv") %>% mutate(language = "Hindi subset 2")) %>%
  bind_rows(read_csv("ud_hin-subset3-results.csv") %>% mutate(language = "Hindi subset 3")) %>%
  bind_rows(read_csv("ud_hin-subset4-results.csv") %>% mutate(language = "Hindi subset 4")) %>%
  bind_rows(read_csv("ud_hin-subset5-results.csv") %>% mutate(language = "Hindi subset 5")) %>%
  bind_rows(read_csv("ud_hin-subset6-results.csv") %>% mutate(language = "Hindi subset 6")) %>%
  bind_rows(read_csv("ud_hin-subset7-results.csv") %>% mutate(language = "Hindi subset 7")) %>%
  bind_rows(read_csv("ud_hin-subset8-results.csv") %>% mutate(language = "Hindi subset 8")) %>%
  bind_rows(read_csv("ud_hin-subset9-results.csv") %>% mutate(language = "Hindi subset 9")) %>%
  bind_rows(read_csv("ud_hin-subset10-results.csv") %>% mutate(language = "Hindi subset 10"))

hungarian <- read_csv("ud_hun-results-excl_singletons.csv") %>%
  mutate(I2 = as.double(I2), language = "Hungarian") # %>%
  bind_rows(read_csv("ud_hun-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 1")) %>%
  bind_rows(read_csv("ud_hun-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 2")) %>%
  bind_rows(read_csv("ud_hun-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 3")) %>%
  bind_rows(read_csv("ud_hun-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 4")) %>%
  bind_rows(read_csv("ud_hun-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 5")) %>%
  bind_rows(read_csv("ud_hun-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 6")) %>%
  bind_rows(read_csv("ud_hun-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 7")) %>%
  bind_rows(read_csv("ud_hun-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 8")) %>%
  bind_rows(read_csv("ud_hun-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 9")) %>%
  bind_rows(read_csv("ud_hun-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Hungarian subset 10"))


indonesian <- read_csv("ud_ind-results-excl_singletons.csv") %>%
  mutate(language = "Indonesian") # %>%
  bind_rows(read_csv("ud_ind-subset1-results.csv") %>% mutate(language = "Indonesian subset 1")) %>%
  bind_rows(read_csv("ud_ind-subset2-results.csv") %>% mutate(language = "Indonesian subset 2")) %>%
  bind_rows(read_csv("ud_ind-subset3-results.csv") %>% mutate(language = "Indonesian subset 3")) %>%
  bind_rows(read_csv("ud_ind-subset4-results.csv") %>% mutate(language = "Indonesian subset 4")) %>%
  bind_rows(read_csv("ud_ind-subset5-results.csv") %>% mutate(language = "Indonesian subset 5")) %>%
  bind_rows(read_csv("ud_ind-subset6-results.csv") %>% mutate(language = "Indonesian subset 6")) %>%
  bind_rows(read_csv("ud_ind-subset7-results.csv") %>% mutate(language = "Indonesian subset 7")) %>%
  bind_rows(read_csv("ud_ind-subset8-results.csv") %>% mutate(language = "Indonesian subset 8")) %>%
  bind_rows(read_csv("ud_ind-subset9-results.csv") %>% mutate(language = "Indonesian subset 9")) %>%
  bind_rows(read_csv("ud_ind-subset10-results.csv") %>% mutate(language = "Indonesian subset 10"))

italian <- read_csv("ud_ita-results.csv") %>%
  mutate(language = "Italian") %>%
  bind_rows(read_csv("ud_ita-subset1-results.csv") %>% mutate(language = "Italian subset 1")) %>%
  bind_rows(read_csv("ud_ita-subset2-results.csv") %>% mutate(language = "Italian subset 2")) %>%
  bind_rows(read_csv("ud_ita-subset3-results.csv") %>% mutate(language = "Italian subset 3")) %>%
  bind_rows(read_csv("ud_ita-subset4-results.csv") %>% mutate(language = "Italian subset 4")) %>%
  bind_rows(read_csv("ud_ita-subset5-results.csv") %>% mutate(language = "Italian subset 5")) %>%
  bind_rows(read_csv("ud_ita-subset6-results.csv") %>% mutate(language = "Italian subset 6")) %>%
  bind_rows(read_csv("ud_ita-subset7-results.csv") %>% mutate(language = "Italian subset 7")) %>%
  bind_rows(read_csv("ud_ita-subset8-results.csv") %>% mutate(language = "Italian subset 8")) %>%
  bind_rows(read_csv("ud_ita-subset9-results.csv") %>% mutate(language = "Italian subset 9")) %>%
  bind_rows(read_csv("ud_ita-subset10-results.csv") %>% mutate(language = "Italian subset 10"))

japanese <- read_csv("ud_ja-results-excl_singletons.csv") %>%
  mutate(I2 = as.double(I2), language = "Japanese") # %>%
  bind_rows(read_csv("ud_ja-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 1")) %>%
  bind_rows(read_csv("ud_ja-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 2")) %>%
  bind_rows(read_csv("ud_ja-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 3")) %>%
  bind_rows(read_csv("ud_ja-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 4")) %>%
  bind_rows(read_csv("ud_ja-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 5")) %>%
  bind_rows(read_csv("ud_ja-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 6")) %>%
  bind_rows(read_csv("ud_ja-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 7")) %>%
  bind_rows(read_csv("ud_ja-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 8")) %>%
  bind_rows(read_csv("ud_ja-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 9")) %>%
  bind_rows(read_csv("ud_ja-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Japanese subset 10"))

karelian <- read_csv("ud_kar-results.csv") %>%
  mutate(language = "Karelian")

kazakh <- read_csv("ud_kaz-results.csv") %>%
  mutate(language = "Kazakh")

korean <- read_csv("ud_kor-results-excl_singletons.csv") %>%
  mutate(language = "Korean") # %>%
  bind_rows(read_csv("ud_kor-subset1-results.csv") %>% mutate(language = "Korean subset 1")) %>%
  bind_rows(read_csv("ud_kor-subset2-results.csv") %>% mutate(language = "Korean subset 2")) %>%
  bind_rows(read_csv("ud_kor-subset3-results.csv") %>% mutate(language = "Korean subset 3")) %>%
  bind_rows(read_csv("ud_kor-subset4-results.csv") %>% mutate(language = "Korean subset 4")) %>%
  bind_rows(read_csv("ud_kor-subset5-results.csv") %>% mutate(language = "Korean subset 5")) %>%
  bind_rows(read_csv("ud_kor-subset6-results.csv") %>% mutate(language = "Korean subset 6")) %>%
  bind_rows(read_csv("ud_kor-subset7-results.csv") %>% mutate(language = "Korean subset 7")) %>%
  bind_rows(read_csv("ud_kor-subset8-results.csv") %>% mutate(language = "Korean subset 8")) %>%
  bind_rows(read_csv("ud_kor-subset9-results.csv") %>% mutate(language = "Korean subset 9")) %>%
  bind_rows(read_csv("ud_kor-subset10-results.csv") %>% mutate(language = "Korean subset 10"))

komi_permyak <- read_csv("ud_kpe-results.csv") %>%
  mutate(language = "Komi Permyak")

kurmanji <- read_csv("ud_kur-results.csv") %>%
  mutate(language = "Kurmanji")

komi_zyrian <- read_csv("ud_kzy-results.csv") %>%
  mutate(language = "Komi Zyrian")

latin <- read_csv("ud_lat-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Latin") %>%
  bind_rows(read_csv("ud_lat-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 1")) %>%
  bind_rows(read_csv("ud_lat-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 2")) %>%
  bind_rows(read_csv("ud_lat-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 3")) %>%
  bind_rows(read_csv("ud_lat-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 4")) %>%
  bind_rows(read_csv("ud_lat-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 5")) %>%
  bind_rows(read_csv("ud_lat-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 6")) %>%
  bind_rows(read_csv("ud_lat-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 7")) %>%
  bind_rows(read_csv("ud_lat-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 8")) %>%
  bind_rows(read_csv("ud_lat-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 9")) %>%
  bind_rows(read_csv("ud_lat-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Latin subset 10"))

lithuanian <- read_csv("ud_lit-results.csv") %>%
  mutate(language = "Lithuanian") %>%
  bind_rows(read_csv("ud_lit-subset1-results.csv") %>% mutate(language = "Lithuanian subset 1")) %>%
  bind_rows(read_csv("ud_lit-subset2-results.csv") %>% mutate(language = "Lithuanian subset 2")) %>%
  bind_rows(read_csv("ud_lit-subset3-results.csv") %>% mutate(language = "Lithuanian subset 3")) %>%
  bind_rows(read_csv("ud_lit-subset4-results.csv") %>% mutate(language = "Lithuanian subset 4")) %>%
  bind_rows(read_csv("ud_lit-subset5-results.csv") %>% mutate(language = "Lithuanian subset 5")) %>%
  bind_rows(read_csv("ud_lit-subset6-results.csv") %>% mutate(language = "Lithuanian subset 6")) %>%
  bind_rows(read_csv("ud_lit-subset7-results.csv") %>% mutate(language = "Lithuanian subset 7")) %>%
  bind_rows(read_csv("ud_lit-subset8-results.csv") %>% mutate(language = "Lithuanian subset 8")) %>%
  bind_rows(read_csv("ud_lit-subset9-results.csv") %>% mutate(language = "Lithuanian subset 9")) %>%
  bind_rows(read_csv("ud_lit-subset10-results.csv") %>% mutate(language = "Lithuanian subset 10"))

livvi <- read_csv("ud_liv-results.csv") %>%
  mutate(language = "Livvi")

latvian <- read_csv("ud_ltv-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Latvian") %>%
  bind_rows(read_csv("ud_ltv-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 1")) %>%
  bind_rows(read_csv("ud_ltv-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 2")) %>%
  bind_rows(read_csv("ud_ltv-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 3")) %>%
  bind_rows(read_csv("ud_ltv-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 4")) %>%
  bind_rows(read_csv("ud_ltv-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 5")) %>%
  bind_rows(read_csv("ud_ltv-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 6")) %>%
  bind_rows(read_csv("ud_ltv-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 7")) %>%
  bind_rows(read_csv("ud_ltv-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 8")) %>%
  bind_rows(read_csv("ud_ltv-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 9")) %>%
  bind_rows(read_csv("ud_ltv-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Latvian subset 10"))

maltese <- read_csv("ud_mal-results.csv") %>%
  mutate(language = "Maltese")

marathi <- read_csv("ud_mar-results.csv") %>%
  mutate(language = "Marathi")

mbya_guarani <- read_csv("ud_mgu-results-excl_singletons.csv") %>%
  mutate(language = "Mbya Guarani")

moksha <- read_csv("ud_mok-results.csv") %>%
  mutate(language = "Moksha")

dutch <- read_csv("ud_ned-results-excl_singletons.csv") %>%
  mutate(language = "Dutch") # %>%
  bind_rows(read_csv("ud_ned-subset1-results.csv") %>% mutate(language = "Dutch subset 1")) %>%
  bind_rows(read_csv("ud_ned-subset2-results.csv") %>% mutate(language = "Dutch subset 2")) %>%
  bind_rows(read_csv("ud_ned-subset3-results.csv") %>% mutate(language = "Dutch subset 3")) %>%
  bind_rows(read_csv("ud_ned-subset4-results.csv") %>% mutate(language = "Dutch subset 4")) %>%
  bind_rows(read_csv("ud_ned-subset5-results.csv") %>% mutate(language = "Dutch subset 5")) %>%
  bind_rows(read_csv("ud_ned-subset6-results.csv") %>% mutate(language = "Dutch subset 6")) %>%
  bind_rows(read_csv("ud_ned-subset7-results.csv") %>% mutate(language = "Dutch subset 7")) %>%
  bind_rows(read_csv("ud_ned-subset8-results.csv") %>% mutate(language = "Dutch subset 8")) %>%
  bind_rows(read_csv("ud_ned-subset9-results.csv") %>% mutate(language = "Dutch subset 9")) %>%
  bind_rows(read_csv("ud_ned-subset10-results.csv") %>% mutate(language = "Dutch subset 10"))

norwegian <- read_csv("ud_nor-results.csv") %>%
  mutate(language = "Norwegian") %>%
  bind_rows(read_csv("ud_nor-subset1-results.csv") %>% mutate(language = "Norwegian subset 1")) %>%
  bind_rows(read_csv("ud_nor-subset2-results.csv") %>% mutate(language = "Norwegian subset 2")) %>%
  bind_rows(read_csv("ud_nor-subset3-results.csv") %>% mutate(language = "Norwegian subset 3")) %>%
  bind_rows(read_csv("ud_nor-subset4-results.csv") %>% mutate(language = "Norwegian subset 4")) %>%
  bind_rows(read_csv("ud_nor-subset5-results.csv") %>% mutate(language = "Norwegian subset 5")) %>%
  bind_rows(read_csv("ud_nor-subset6-results.csv") %>% mutate(language = "Norwegian subset 6")) %>%
  bind_rows(read_csv("ud_nor-subset7-results.csv") %>% mutate(language = "Norwegian subset 7")) %>%
  bind_rows(read_csv("ud_nor-subset8-results.csv") %>% mutate(language = "Norwegian subset 8")) %>%
  bind_rows(read_csv("ud_nor-subset9-results.csv") %>% mutate(language = "Norwegian subset 9")) %>%
  bind_rows(read_csv("ud_nor-subset10-results.csv") %>% mutate(language = "Norwegian subset 10"))

nigerian_pidgin <- read_csv("ud_npe-results.csv") %>%
  mutate(language = "Nigerian Pidgin")

north_sami <- read_csv("ud_nsa-results.csv") %>%
  mutate(I2 = as.double(I2), language = "North Sami") %>%
  bind_rows(read_csv("ud_nsa-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 1")) %>%
  bind_rows(read_csv("ud_nsa-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 2")) %>%
  bind_rows(read_csv("ud_nsa-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 3")) %>%
  bind_rows(read_csv("ud_nsa-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 4")) %>%
  bind_rows(read_csv("ud_nsa-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 5")) %>%
  bind_rows(read_csv("ud_nsa-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 6")) %>%
  bind_rows(read_csv("ud_nsa-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 7")) %>%
  bind_rows(read_csv("ud_nsa-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 8")) %>%
  bind_rows(read_csv("ud_nsa-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 9")) %>%
  bind_rows(read_csv("ud_nsa-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "North Sami subset 10"))

old_church_slavonic <- read_csv("ud_ocs-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Old Church Slavonic") %>%
  bind_rows(read_csv("ud_ocs-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 1")) %>%
  bind_rows(read_csv("ud_ocs-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 2")) %>%
  bind_rows(read_csv("ud_ocs-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 3")) %>%
  bind_rows(read_csv("ud_ocs-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 4")) %>%
  bind_rows(read_csv("ud_ocs-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 5")) %>%
  bind_rows(read_csv("ud_ocs-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 6")) %>%
  bind_rows(read_csv("ud_ocs-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 7")) %>%
  bind_rows(read_csv("ud_ocs-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 8")) %>%
  bind_rows(read_csv("ud_ocs-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 9")) %>%
  bind_rows(read_csv("ud_ocs-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Old Church Slavonic subset 10"))

old_french <- read_csv("ud_ofr-results.csv") %>%
  mutate(language = "Old French") %>%
  bind_rows(read_csv("ud_ofr-subset1-results.csv") %>% mutate(language = "Old French subset 1")) %>%
  bind_rows(read_csv("ud_ofr-subset2-results.csv") %>% mutate(language = "Old French subset 2")) %>%
  bind_rows(read_csv("ud_ofr-subset3-results.csv") %>% mutate(language = "Old French subset 3")) %>%
  bind_rows(read_csv("ud_ofr-subset4-results.csv") %>% mutate(language = "Old French subset 4")) %>%
  bind_rows(read_csv("ud_ofr-subset5-results.csv") %>% mutate(language = "Old French subset 5")) %>%
  bind_rows(read_csv("ud_ofr-subset6-results.csv") %>% mutate(language = "Old French subset 6")) %>%
  bind_rows(read_csv("ud_ofr-subset7-results.csv") %>% mutate(language = "Old French subset 7")) %>%
  bind_rows(read_csv("ud_ofr-subset8-results.csv") %>% mutate(language = "Old French subset 8")) %>%
  bind_rows(read_csv("ud_ofr-subset9-results.csv") %>% mutate(language = "Old French subset 9")) %>%
  bind_rows(read_csv("ud_ofr-subset10-results.csv") %>% mutate(language = "Old French subset 10"))

old_russian <- read_csv("ud_oru-results.csv") %>%
  mutate(language = "Old Russian") %>%
  bind_rows(read_csv("ud_oru-subset1-results.csv") %>% mutate(language = "Old Russian subset 1")) %>%
  bind_rows(read_csv("ud_oru-subset2-results.csv") %>% mutate(language = "Old Russian subset 2")) %>%
  bind_rows(read_csv("ud_oru-subset3-results.csv") %>% mutate(language = "Old Russian subset 3")) %>%
  bind_rows(read_csv("ud_oru-subset4-results.csv") %>% mutate(language = "Old Russian subset 4")) %>%
  bind_rows(read_csv("ud_oru-subset5-results.csv") %>% mutate(language = "Old Russian subset 5")) %>%
  bind_rows(read_csv("ud_oru-subset6-results.csv") %>% mutate(language = "Old Russian subset 6")) %>%
  bind_rows(read_csv("ud_oru-subset7-results.csv") %>% mutate(language = "Old Russian subset 7")) %>%
  bind_rows(read_csv("ud_oru-subset8-results.csv") %>% mutate(language = "Old Russian subset 8")) %>%
  bind_rows(read_csv("ud_oru-subset9-results.csv") %>% mutate(language = "Old Russian subset 9")) %>%
  bind_rows(read_csv("ud_oru-subset10-results.csv") %>% mutate(language = "Old Russian subset 10"))

polish <- read_csv("ud_pol-results.csv") %>%
  mutate(language = "Polish") %>%
  bind_rows(read_csv("ud_pol-subset1-results.csv") %>% mutate(language = "Polish subset 1")) %>%
  bind_rows(read_csv("ud_pol-subset2-results.csv") %>% mutate(language = "Polish subset 2")) %>%
  bind_rows(read_csv("ud_pol-subset3-results.csv") %>% mutate(language = "Polish subset 3")) %>%
  bind_rows(read_csv("ud_pol-subset4-results.csv") %>% mutate(language = "Polish subset 4")) %>%
  bind_rows(read_csv("ud_pol-subset5-results.csv") %>% mutate(language = "Polish subset 5")) %>%
  bind_rows(read_csv("ud_pol-subset6-results.csv") %>% mutate(language = "Polish subset 6")) %>%
  bind_rows(read_csv("ud_pol-subset7-results.csv") %>% mutate(language = "Polish subset 7")) %>%
  bind_rows(read_csv("ud_pol-subset8-results.csv") %>% mutate(language = "Polish subset 8")) %>%
  bind_rows(read_csv("ud_pol-subset9-results.csv") %>% mutate(language = "Polish subset 9")) %>%
  bind_rows(read_csv("ud_pol-subset10-results.csv") %>% mutate(language = "Polish subset 10"))

portuguese <- read_csv("ud_por-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Portuguese") %>%
  bind_rows(read_csv("ud_por-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 1")) %>%
  bind_rows(read_csv("ud_por-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 2")) %>%
  bind_rows(read_csv("ud_por-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 3")) %>%
  bind_rows(read_csv("ud_por-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 4")) %>%
  bind_rows(read_csv("ud_por-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 5")) %>%
  bind_rows(read_csv("ud_por-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 6")) %>%
  bind_rows(read_csv("ud_por-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 7")) %>%
  bind_rows(read_csv("ud_por-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 8")) %>%
  bind_rows(read_csv("ud_por-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 9")) %>%
  bind_rows(read_csv("ud_por-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Portuguese subset 10"))

romanian <- read_csv("ud_rom-results.csv") %>%
  mutate(language = "Romanian") %>%
  bind_rows(read_csv("ud_rom-subset1-results.csv") %>% mutate(language = "Romanian subset 1")) %>%
  bind_rows(read_csv("ud_rom-subset2-results.csv") %>% mutate(language = "Romanian subset 2")) %>%
  bind_rows(read_csv("ud_rom-subset3-results.csv") %>% mutate(language = "Romanian subset 3")) %>%
  bind_rows(read_csv("ud_rom-subset4-results.csv") %>% mutate(language = "Romanian subset 4")) %>%
  bind_rows(read_csv("ud_rom-subset5-results.csv") %>% mutate(language = "Romanian subset 5")) %>%
  bind_rows(read_csv("ud_rom-subset6-results.csv") %>% mutate(language = "Romanian subset 6")) %>%
  bind_rows(read_csv("ud_rom-subset7-results.csv") %>% mutate(language = "Romanian subset 7")) %>%
  bind_rows(read_csv("ud_rom-subset8-results.csv") %>% mutate(language = "Romanian subset 8")) %>%
  bind_rows(read_csv("ud_rom-subset9-results.csv") %>% mutate(language = "Romanian subset 9")) %>%
  bind_rows(read_csv("ud_rom-subset10-results.csv") %>% mutate(language = "Romanian subset 10"))

russian <- read_csv("ud_rus-results.csv") %>%
  mutate(language = "Russian") %>%
  bind_rows(read_csv("ud_rus-subset1-results.csv") %>% mutate(language = "Russian subset 1")) %>%
  bind_rows(read_csv("ud_rus-subset2-results.csv") %>% mutate(language = "Russian subset 2")) %>%
  bind_rows(read_csv("ud_rus-subset3-results.csv") %>% mutate(language = "Russian subset 3")) %>%
  bind_rows(read_csv("ud_rus-subset4-results.csv") %>% mutate(language = "Russian subset 4")) %>%
  bind_rows(read_csv("ud_rus-subset5-results.csv") %>% mutate(language = "Russian subset 5")) %>%
  bind_rows(read_csv("ud_rus-subset6-results.csv") %>% mutate(language = "Russian subset 6")) %>%
  bind_rows(read_csv("ud_rus-subset7-results.csv") %>% mutate(language = "Russian subset 7")) %>%
  bind_rows(read_csv("ud_rus-subset8-results.csv") %>% mutate(language = "Russian subset 8")) %>%
  bind_rows(read_csv("ud_rus-subset9-results.csv") %>% mutate(language = "Russian subset 9")) %>%
  bind_rows(read_csv("ud_rus-subset10-results.csv") %>% mutate(language = "Russian subset 10"))

sanskrit <- read_csv("ud_san-results.csv") %>%
  mutate(language = "Sanskrit")

serbian <- read_csv("ud_ser-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Serbian") %>%
  bind_rows(read_csv("ud_ser-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 1")) %>%
  bind_rows(read_csv("ud_ser-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 2")) %>%
  bind_rows(read_csv("ud_ser-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 3")) %>%
  bind_rows(read_csv("ud_ser-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 4")) %>%
  bind_rows(read_csv("ud_ser-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 5")) %>%
  bind_rows(read_csv("ud_ser-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 6")) %>%
  bind_rows(read_csv("ud_ser-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 7")) %>%
  bind_rows(read_csv("ud_ser-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 8")) %>%
  bind_rows(read_csv("ud_ser-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 9")) %>%
  bind_rows(read_csv("ud_ser-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Serbian subset 10"))

slovakian <- read_csv("ud_slvk-results.csv") %>%
  mutate(language = "Slovak") %>%
  bind_rows(read_csv("ud_slvk-subset1-results.csv") %>% mutate(language = "Slovak subset 1")) %>%
  bind_rows(read_csv("ud_slvk-subset2-results.csv") %>% mutate(language = "Slovak subset 2")) %>%
  bind_rows(read_csv("ud_slvk-subset3-results.csv") %>% mutate(language = "Slovak subset 3")) %>%
  bind_rows(read_csv("ud_slvk-subset4-results.csv") %>% mutate(language = "Slovak subset 4")) %>%
  bind_rows(read_csv("ud_slvk-subset5-results.csv") %>% mutate(language = "Slovak subset 5")) %>%
  bind_rows(read_csv("ud_slvk-subset6-results.csv") %>% mutate(language = "Slovak subset 6")) %>%
  bind_rows(read_csv("ud_slvk-subset7-results.csv") %>% mutate(language = "Slovak subset 7")) %>%
  bind_rows(read_csv("ud_slvk-subset8-results.csv") %>% mutate(language = "Slovak subset 8")) %>%
  bind_rows(read_csv("ud_slvk-subset9-results.csv") %>% mutate(language = "Slovak subset 9")) %>%
  bind_rows(read_csv("ud_slvk-subset10-results.csv") %>% mutate(language = "Slovak subset 10"))

slovenian <- read_csv("ud_slvk-results.csv") %>%
  mutate(language = "Slovenian") %>%
  bind_rows(read_csv("ud_slvn-subset1-results.csv") %>% mutate(language = "Slovenian subset 1")) %>%
  bind_rows(read_csv("ud_slvn-subset2-results.csv") %>% mutate(language = "Slovenian subset 2")) %>%
  bind_rows(read_csv("ud_slvn-subset3-results.csv") %>% mutate(language = "Slovenian subset 3")) %>%
  bind_rows(read_csv("ud_slvn-subset4-results.csv") %>% mutate(language = "Slovenian subset 4")) %>%
  bind_rows(read_csv("ud_slvn-subset5-results.csv") %>% mutate(language = "Slovenian subset 5")) %>%
  bind_rows(read_csv("ud_slvn-subset6-results.csv") %>% mutate(language = "Slovenian subset 6")) %>%
  bind_rows(read_csv("ud_slvn-subset7-results.csv") %>% mutate(language = "Slovenian subset 7")) %>%
  bind_rows(read_csv("ud_slvn-subset8-results.csv") %>% mutate(language = "Slovenian subset 8")) %>%
  bind_rows(read_csv("ud_slvn-subset9-results.csv") %>% mutate(language = "Slovenian subset 9")) %>%
  bind_rows(read_csv("ud_slvn-subset10-results.csv") %>% mutate(language = "Slovenian subset 10"))

spanish <- read_csv("ud_slvn-results.csv") %>%
  mutate(language = "Spanish") %>%
  bind_rows(read_csv("ud_spa-subset1-results.csv") %>% mutate(language = "Spanish subset 1")) %>%
  bind_rows(read_csv("ud_spa-subset2-results.csv") %>% mutate(language = "Spanish subset 2")) %>%
  bind_rows(read_csv("ud_spa-subset3-results.csv") %>% mutate(language = "Spanish subset 3")) %>%
  bind_rows(read_csv("ud_spa-subset4-results.csv") %>% mutate(language = "Spanish subset 4")) %>%
  bind_rows(read_csv("ud_spa-subset5-results.csv") %>% mutate(language = "Spanish subset 5")) %>%
  bind_rows(read_csv("ud_spa-subset6-results.csv") %>% mutate(language = "Spanish subset 6")) %>%
  bind_rows(read_csv("ud_spa-subset7-results.csv") %>% mutate(language = "Spanish subset 7")) %>%
  bind_rows(read_csv("ud_spa-subset8-results.csv") %>% mutate(language = "Spanish subset 8")) %>%
  bind_rows(read_csv("ud_spa-subset9-results.csv") %>% mutate(language = "Spanish subset 9")) %>%
  bind_rows(read_csv("ud_spa-subset10-results.csv") %>% mutate(language = "Spanish subset 10"))

skolt_sami <- read_csv("ud_ssa-results.csv") %>%
  mutate(language = "Skolt Sami")

swedish_sign <- read_csv("ud_ssl-results.csv") %>%
  mutate(language = "Swedish Sign Language")

assyrian <- read_csv("ud_sur-results.csv") %>%
  mutate(language = "Assyrian")

swedish <- read_csv("ud_swe-results.csv") %>%
  mutate(language = "Swedish") %>%
  bind_rows(read_csv("ud_swe-subset1-results.csv") %>% mutate(language = "Swedish subset 1")) %>%
  bind_rows(read_csv("ud_swe-subset2-results.csv") %>% mutate(language = "Swedish subset 2")) %>%
  bind_rows(read_csv("ud_swe-subset3-results.csv") %>% mutate(language = "Swedish subset 3")) %>%
  bind_rows(read_csv("ud_swe-subset4-results.csv") %>% mutate(language = "Swedish subset 4")) %>%
  bind_rows(read_csv("ud_swe-subset5-results.csv") %>% mutate(language = "Swedish subset 5")) %>%
  bind_rows(read_csv("ud_swe-subset6-results.csv") %>% mutate(language = "Swedish subset 6")) %>%
  bind_rows(read_csv("ud_swe-subset7-results.csv") %>% mutate(language = "Swedish subset 7")) %>%
  bind_rows(read_csv("ud_swe-subset8-results.csv") %>% mutate(language = "Swedish subset 8")) %>%
  bind_rows(read_csv("ud_swe-subset9-results.csv") %>% mutate(language = "Swedish subset 9")) %>%
  bind_rows(read_csv("ud_swe-subset10-results.csv") %>% mutate(language = "Swedish subset 10"))

swiss_german <- read_csv("ud_swg-results.csv") %>%
  mutate(language = "Swiss German")

tagalog <- read_csv("ud_tag-results-excl_singletons.csv") %>%
  mutate(language = "Tagalog")

tamil <- read_csv("ud_tam-results.csv") %>%
  mutate(language = "Tamil")

telugu <- read_csv("ud_tel-results.csv") %>%
  mutate(language = "Telugu") %>%
  bind_rows(read_csv("ud_tel-subset1-results.csv") %>% mutate(language = "Telugu subset 1")) %>%
  bind_rows(read_csv("ud_tel-subset2-results.csv") %>% mutate(language = "Telugu subset 2")) %>%
  bind_rows(read_csv("ud_tel-subset3-results.csv") %>% mutate(language = "Telugu subset 3")) %>%
  bind_rows(read_csv("ud_tel-subset4-results.csv") %>% mutate(language = "Telugu subset 4")) %>%
  bind_rows(read_csv("ud_tel-subset5-results.csv") %>% mutate(language = "Telugu subset 5")) %>%
  bind_rows(read_csv("ud_tel-subset6-results.csv") %>% mutate(language = "Telugu subset 6")) %>%
  bind_rows(read_csv("ud_tel-subset7-results.csv") %>% mutate(language = "Telugu subset 7")) %>%
  bind_rows(read_csv("ud_tel-subset8-results.csv") %>% mutate(language = "Telugu subset 8")) %>%
  bind_rows(read_csv("ud_tel-subset9-results.csv") %>% mutate(language = "Telugu subset 9")) %>%
  bind_rows(read_csv("ud_tel-subset10-results.csv") %>% mutate(language = "Telugu subset 10"))

thai <- read_csv("ud_tha-results.csv") %>%
  mutate(language = "Thai")

turkish <- read_csv("ud_tur-results-excl_singletons.csv") %>%
  mutate(language = "Turkish") # %>%
  bind_rows(read_csv("ud_tur-subset1-results.csv") %>% mutate(language = "Turkish subset 1")) %>%
  bind_rows(read_csv("ud_tur-subset2-results.csv") %>% mutate(language = "Turkish subset 2")) %>%
  bind_rows(read_csv("ud_tur-subset3-results.csv") %>% mutate(language = "Turkish subset 3")) %>%
  bind_rows(read_csv("ud_tur-subset4-results.csv") %>% mutate(language = "Turkish subset 4")) %>%
  bind_rows(read_csv("ud_tur-subset5-results.csv") %>% mutate(language = "Turkish subset 5")) %>%
  bind_rows(read_csv("ud_tur-subset6-results.csv") %>% mutate(language = "Turkish subset 6")) %>%
  bind_rows(read_csv("ud_tur-subset7-results.csv") %>% mutate(language = "Turkish subset 7")) %>%
  bind_rows(read_csv("ud_tur-subset8-results.csv") %>% mutate(language = "Turkish subset 8")) %>%
  bind_rows(read_csv("ud_tur-subset9-results.csv") %>% mutate(language = "Turkish subset 9")) %>%
  bind_rows(read_csv("ud_tur-subset10-results.csv") %>% mutate(language = "Turkish subset 10"))

ukrainian <- read_csv("ud_ukr-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Ukrainian") %>%
  bind_rows(read_csv("ud_ukr-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 1")) %>%
  bind_rows(read_csv("ud_ukr-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 2")) %>%
  bind_rows(read_csv("ud_ukr-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 3")) %>%
  bind_rows(read_csv("ud_ukr-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 4")) %>%
  bind_rows(read_csv("ud_ukr-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 5")) %>%
  bind_rows(read_csv("ud_ukr-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 6")) %>%
  bind_rows(read_csv("ud_ukr-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 7")) %>%
  bind_rows(read_csv("ud_ukr-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 8")) %>%
  bind_rows(read_csv("ud_ukr-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 9")) %>%
  bind_rows(read_csv("ud_ukr-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Ukrainian subset 10"))

urdu <- read_csv("ud_urd-results.csv") %>%
  mutate(language = "Urdu") %>%
  bind_rows(read_csv("ud_urd-subset1-results.csv") %>% mutate(language = "Urdu subset 1")) %>%
  bind_rows(read_csv("ud_urd-subset2-results.csv") %>% mutate(language = "Urdu subset 2")) %>%
  bind_rows(read_csv("ud_urd-subset3-results.csv") %>% mutate(language = "Urdu subset 3")) %>%
  bind_rows(read_csv("ud_urd-subset4-results.csv") %>% mutate(language = "Urdu subset 4")) %>%
  bind_rows(read_csv("ud_urd-subset5-results.csv") %>% mutate(language = "Urdu subset 5")) %>%
  bind_rows(read_csv("ud_urd-subset6-results.csv") %>% mutate(language = "Urdu subset 6")) %>%
  bind_rows(read_csv("ud_urd-subset7-results.csv") %>% mutate(language = "Urdu subset 7")) %>%
  bind_rows(read_csv("ud_urd-subset8-results.csv") %>% mutate(language = "Urdu subset 8")) %>%
  bind_rows(read_csv("ud_urd-subset9-results.csv") %>% mutate(language = "Urdu subset 9")) %>%
  bind_rows(read_csv("ud_urd-subset10-results.csv") %>% mutate(language = "Urdu subset 10"))

upper_sorbian <- read_csv("ud_uso-results.csv") %>%
  mutate(language = "Upper Sorbian")

uyghur <- read_csv("ud_uyg-results.csv") %>%
  mutate(I2 = as.double(I2), language = "Uyghur") %>%
  bind_rows(read_csv("ud_uyg-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 1")) %>%
  bind_rows(read_csv("ud_uyg-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 2")) %>%
  bind_rows(read_csv("ud_uyg-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 3")) %>%
  bind_rows(read_csv("ud_uyg-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 4")) %>%
  bind_rows(read_csv("ud_uyg-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 5")) %>%
  bind_rows(read_csv("ud_uyg-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 6")) %>%
  bind_rows(read_csv("ud_uyg-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 7")) %>%
  bind_rows(read_csv("ud_uyg-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 8")) %>%
  bind_rows(read_csv("ud_uyg-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 9")) %>%
  bind_rows(read_csv("ud_uyg-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Uyghur subset 10"))

vietnamese <- read_csv("ud_vie-results-excl_singletons.csv") %>%
  mutate(I2 = as.double(I2), language = "Vietnamese") # %>%
  bind_rows(read_csv("ud_vie-subset1-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 1")) %>%
  bind_rows(read_csv("ud_vie-subset2-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 2")) %>%
  bind_rows(read_csv("ud_vie-subset3-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 3")) %>%
  bind_rows(read_csv("ud_vie-subset4-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 4")) %>%
  bind_rows(read_csv("ud_vie-subset5-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 5")) %>%
  bind_rows(read_csv("ud_vie-subset6-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 6")) %>%
  bind_rows(read_csv("ud_vie-subset7-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 7")) %>%
  bind_rows(read_csv("ud_vie-subset8-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 8")) %>%
  bind_rows(read_csv("ud_vie-subset9-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 9")) %>%
  bind_rows(read_csv("ud_vie-subset10-results.csv") %>% mutate(I2 = as.double(I2), language = "Vietnamese subset 10"))

warlpiri <- read_csv("ud_war-results-excl_singletons.csv") %>%
  mutate(language = "Warlpiri")

wolof <- read_csv("ud_wol-results-excl_singletons.csv") %>%
  mutate(language = "Wolof") # %>%
  bind_rows(read_csv("ud_wol-subset1-results.csv") %>% mutate(language = "Wolof subset 1")) %>%
  bind_rows(read_csv("ud_wol-subset2-results.csv") %>% mutate(language = "Wolof subset 2")) %>%
  bind_rows(read_csv("ud_wol-subset3-results.csv") %>% mutate(language = "Wolof subset 3")) %>%
  bind_rows(read_csv("ud_wol-subset4-results.csv") %>% mutate(language = "Wolof subset 4")) %>%
  bind_rows(read_csv("ud_wol-subset5-results.csv") %>% mutate(language = "Wolof subset 5")) %>%
  bind_rows(read_csv("ud_wol-subset6-results.csv") %>% mutate(language = "Wolof subset 6")) %>%
  bind_rows(read_csv("ud_wol-subset7-results.csv") %>% mutate(language = "Wolof subset 7")) %>%
  bind_rows(read_csv("ud_wol-subset8-results.csv") %>% mutate(language = "Wolof subset 8")) %>%
  bind_rows(read_csv("ud_wol-subset9-results.csv") %>% mutate(language = "Wolof subset 9")) %>%
  bind_rows(read_csv("ud_wol-subset10-results.csv") %>% mutate(language = "Wolof subset 10"))

yoruba <- read_csv("ud_yor-results.csv") %>%
  mutate(language = "Yoruba")

mandarin <- read_csv("ud_zho-results-excl_singletons.csv") %>%
  mutate(language = "Mandarin") # %>%
  bind_rows(read_csv("ud_zho-subset1-results.csv") %>% mutate(language = "Mandarin subset 1")) %>%
  bind_rows(read_csv("ud_zho-subset2-results.csv") %>% mutate(language = "Mandarin subset 2")) %>%
  bind_rows(read_csv("ud_zho-subset3-results.csv") %>% mutate(language = "Mandarin subset 3")) %>%
  bind_rows(read_csv("ud_zho-subset4-results.csv") %>% mutate(language = "Mandarin subset 4")) %>%
  bind_rows(read_csv("ud_zho-subset5-results.csv") %>% mutate(language = "Mandarin subset 5")) %>%
  bind_rows(read_csv("ud_zho-subset6-results.csv") %>% mutate(language = "Mandarin subset 6")) %>%
  bind_rows(read_csv("ud_zho-subset7-results.csv") %>% mutate(language = "Mandarin subset 7")) %>%
  bind_rows(read_csv("ud_zho-subset8-results.csv") %>% mutate(language = "Mandarin subset 8")) %>%
  bind_rows(read_csv("ud_zho-subset9-results.csv") %>% mutate(language = "Mandarin subset 9")) %>%
  bind_rows(read_csv("ud_zho-subset10-results.csv") %>% mutate(language = "Mandarin subset 10"))

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

#langs <- list(afrikaans, akkadian, amharic, ancient_greek, arabic, armenian,
#              assyrian, bambara, basque, belarusian, bhojpuri, breton, bulgarian,
#              buryat, cantonese, catalan, childes, classical_chinese, coptic,
#              croatian, czech, danish, dutch, english, erzya, estonian, faroese,
#              farsi, finnish, french, galician, german, gothic, greek, hebrew,
#              hindi, hungarian, indonesian, irish, italian, japanese, karelian,
#              kazakh, komi_permyak, komi_zyrian, korean, kurmanji, latin, latvian,
#              lithuanian, livvi, maltese, mandarin, marathi, mbya_guarani, moksha,
#              nigerian_pidgin, north_sami, norwegian, old_church_slavonic, old_french,
#              old_russian, polish, portuguese, romanian, russian, sanskrit,
#              scottish_gaelic, serbian, skolt_sami, slovakian, slovenian, spanish,
#              swedish, swedish_sign, swiss_german, tagalog, tamil, telugu, thai,
#              turkish, ukrainian, upper_sorbian, urdu, uyghur, vietnamese, warlpiri,
#              welsh, wolof, yoruba)
langs <- list(basque, breton, dutch, english, german, hindi, hungarian, indonesian, irish, 
              japanese, korean, mandarin, mbya_guarani, scottish_gaelic, tagalog,
              turkish, vietnamese, warlpiri, welsh, wolof)

percent_deterministic_utts <- map_df(langs, calc_deterministic_percent)
proportion_deterministic_utts_by_wo <- map_df(langs, calc_deterministic_proportion)

big_table_o_data <- tribble(
  ~language, ~measure, ~word_order, ~score, ~rank
) %>%
  bind_rows(map_df(langs, function(df) {
    bind_rows(calcEntRankings(filter(df, !str_detect(language, "subset"))), 
              calcSurpRankings(filter(df, !str_detect(language, "subset"))),
              calcMIRankings(filter(df, !str_detect(language, "subset"))))
  }))

class_accs <- left_join(filter(big_table_o_data, rank == 1), rename(meta, language = Language), big_table_o_data, by = "language") %>%
  mutate(acc = as.integer(word_order == Classification))

prediction_accuracies_class <- tribble(
  ~ent_uid, ~surp_uid, ~mi,
  sum(filter(class_accs, measure == "entropy UID")$acc), sum(filter(class_accs, measure == "surprisal UID")$acc), sum(filter(class_accs, measure == "mi")$acc)
)

most_common_word_order <- function(df) {
  x <- select(df, SVO, SOV, VSO, VOS, OVS, OSV)
  colnames(x)[apply(x,1,which.max)]
}

count_accs <- left_join(filter(big_table_o_data, rank == 1), rename(mutate(meta, most_common = most_common_word_order(meta)), language = Language), big_table_o_data, by = "language") %>%
  mutate(acc = as.integer(word_order == most_common))


prediction_accuracies_counts <- tribble(
  ~ent_uid, ~surp_uid, ~mi,
  sum(filter(count_accs, measure == "entropy UID")$acc), sum(filter(count_accs, measure == "surprisal UID")$acc), sum(filter(count_accs, measure == "mi")$acc)
)

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

(confusion_matrix <- tribble(
  ~measure, ~svo_precision, ~svo_recall, ~sov_precision, ~sov_recall, ~vso_precision, ~vso_recall,
  "entropy UID", 100*calc_precision(m = "entropy UID", class = "SVO"), 100*calc_recall(m = "entropy UID", class = "SVO"), 100*calc_precision(m = "entropy UID", class = "SOV"), 100*calc_recall(m = "entropy UID", class = "SOV"), 100*calc_precision(m = "entropy UID", class = "VSO"), 100*calc_recall(m = "entropy UID", class = "VSO"),
  "surprisal UID", 100*calc_precision(m = "surprisal UID", class = "SVO"), 100*calc_recall(m = "surprisal UID", class = "SVO"), 100*calc_precision(m = "surprisal UID", class = "SOV"), 100*calc_recall(m = "surprisal UID", class = "SOV"), 100*calc_precision(m = "surprisal UID", class = "VSO"), 100*calc_recall(m = "surprisal UID", class = "VSO"),
  "mi", 100*calc_precision(m = "mi", class = "SVO"), 100*calc_recall(m = "mi", class = "SVO"), 100*calc_precision(m = "mi", class = "SOV"), 100*calc_recall(m = "mi", class = "SOV"), 100*calc_precision(m = "mi", class = "VSO"), 100*calc_recall(m = "mi", class = "VSO")
))

svo_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "SVO") %>% select(score) %>% summarize(avg = mean(score))
sov_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "SOV") %>% select(score) %>% summarize(avg = mean(score))
vso_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "VSO") %>% select(score) %>% summarize(avg = mean(score))
vos_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "VOS") %>% select(score) %>% summarize(avg = mean(score))
ovs_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "OVS") %>% select(score) %>% summarize(avg = mean(score))
osv_agg_ent <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "entropy UID") %>% filter(word_order == "OSV") %>% select(score) %>% summarize(avg = mean(score))

#no_svos <- left_join(big_table_o_data, rename(meta, language = Language), by = "language") %>% filter(Classification != "SVO")

#svo_agg_ent <- no_svos %>% filter(measure == "entropy UID") %>% filter(word_order == "SVO") %>% select(score) %>% sum/length(unique(no_svos))
#sov_agg_ent <- no_svos %>% filter(measure == "entropy UID") %>% filter(word_order == "SOV") %>% select(score) %>% sum/length(unique(no_svos))
#vso_agg_ent <- no_svos %>% filter(measure == "entropy UID") %>% filter(word_order == "VSO") %>% select(score) %>% sum/length(unique(no_svos))
#vos_agg_ent <- no_svos %>% filter(measure == "entropy UID") %>% filter(word_order == "VOS") %>% select(score) %>% sum/length(unique(no_svos))
#ovs_agg_ent <- no_svos %>% filter(measure == "entropy UID") %>% filter(word_order == "OVS") %>% select(score) %>% sum/length(unique(no_svos))
#osv_agg_ent <- no_svos %>% filter(measure == "entropy UID") %>% filter(word_order == "OSV") %>% select(score) %>% sum/length(unique(no_svos))

(tribble(
  ~word_order, ~score,
  "OVS", ovs_agg_ent[[1]],
  "SOV", sov_agg_ent[[1]],
  "OSV", osv_agg_ent[[1]],
  "VOS", vos_agg_ent[[1]],
  "VSO", vso_agg_ent[[1]],
  "SVO", svo_agg_ent[[1]]
) %>% arrange(score) %>%
    mutate(rank = min_rank(score)))

svo_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "SVO") %>% select(score) %>% summarize(avg = mean(score))
sov_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "SOV") %>% select(score) %>% summarize(avg = mean(score))
vso_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "VSO") %>% select(score) %>% summarize(avg = mean(score))
vos_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "VOS") %>% select(score) %>% summarize(avg = mean(score))
ovs_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "OVS") %>% select(score) %>% summarize(avg = mean(score))
osv_agg_surp <- big_table_o_data %>% filter(language != "English CHILDES") %>% filter(measure == "surprisal UID") %>% filter(word_order == "OSV") %>% select(score) %>% summarize(avg = mean(score))

(tribble(
  ~word_order, ~score,
  "OVS", ovs_agg_surp[[1]],
  "SOV", sov_agg_surp[[1]],
  "OSV", osv_agg_surp[[1]],
  "VOS", vos_agg_surp[[1]],
  "VSO", vso_agg_surp[[1]],
  "SVO", svo_agg_surp[[1]]
) %>% arrange(score) %>%
    mutate(rank = min_rank(score)))

z_score <- function(df) {
  mean_mi <- mean(df$Mutual_Information)
  sd_mi <- sd(df$Mutual_Information)
  df %>% mutate(mi_z_score = (Mutual_Information-mean_mi)/sd_mi)
}

z_scores <- tribble(
  ~language, ~word_order, ~score
) %>% bind_rows(map_df(langs, function(df) {
  rename(filter(df, !str_detect(language, "subset")) %>%
           z_score %>% 
           calcZScoreRankings, score = mi_z_score)
}))

(svo_agg_mi <- z_scores %>% filter(word_order == "SVO") %>% select(score) %>% summarize(avg = mean(score)))
(sov_agg_mi <- z_scores %>% filter(word_order == "SOV") %>% select(score) %>% summarize(avg = mean(score)))
(vso_agg_mi <- z_scores %>% filter(word_order == "VSO") %>% select(score) %>% summarize(avg = mean(score)))
(vos_agg_mi <- z_scores %>% filter(word_order == "VOS") %>% select(score) %>% summarize(avg = mean(score)))
(ovs_agg_mi <- z_scores %>% filter(word_order == "OVS") %>% select(score) %>% summarize(avg = mean(score)))
(osv_agg_mi <- z_scores %>% filter(word_order == "OSV") %>% select(score) %>% summarize(avg = mean(score)))

(tribble(
  ~word_order, ~score,
  "OVS", ovs_agg_mi[[1]],
  "SOV", sov_agg_mi[[1]],
  "OSV", osv_agg_mi[[1]],
  "VOS", vos_agg_mi[[1]],
  "VSO", vso_agg_mi[[1]],
  "SVO", svo_agg_mi[[1]]
) %>% arrange(desc(score)))

anova_df <- big_table_o_data %>% 
  filter(language != "English CHILDES") %>%
  filter(measure == "entropy UID" | measure == "surprisal UID") %>%
  select(measure, word_order, score) %>%
  bind_rows(select(mutate(z_scores, measure = "mutual info"), measure, word_order, score)) %>%
  mutate(word_order = as.factor(word_order))

oneway.test(score ~ word_order,
            data = filter(anova_df, measure == "entropy UID"),
            var.equal=FALSE)

oneway.test(score ~ word_order,
            data = filter(anova_df, measure == "surprisal UID"),
            var.equal=FALSE)

oneway.test(score ~ word_order,
            data = filter(anova_df, measure == "mutual info"),
            var.equal=FALSE)

t.test(x = filter(anova_df, measure == "mutual info", word_order == "SOV")$score, 
       y = filter(anova_df, measure == "mutual info", word_order == "VSO")$score, 
       var.equal = FALSE)

t.test(x = filter(anova_df, measure == "mutual info", word_order == "SOV")$score, 
       y = filter(anova_df, measure == "mutual info", word_order == "SVO")$score, 
       var.equal = FALSE)

t.test(x = filter(anova_df, measure == "mutual info", word_order == "VSO")$score, 
       y = filter(anova_df, measure == "mutual info", word_order == "SVO")$score, 
       var.equal = FALSE)


anova_df_allUtts <- langs %>% 
  map_df(select, Word_Order, Entropy_Deviation_Score) %>% 
  mutate(measure = "entropy UID") %>% 
  rename(score = Entropy_Deviation_Score) %>%
  bind_rows(langs %>% 
              map_df(select, Word_Order, Surprisal_Deviation_Score) %>% 
              mutate(measure = "surprisal UID") %>% 
              rename(score = Surprisal_Deviation_Score)) %>%
  mutate(Word_Order = as.factor(Word_Order))

tribble(
  ~wo, ~score,
  "OSV", mean(filter(anova_df_allUtts, Word_Order == "OSV", measure == "entropy UID")$score),
  "OVS", mean(filter(anova_df_allUtts, Word_Order == "OVS", measure == "entropy UID")$score),
  "VOS", mean(filter(anova_df_allUtts, Word_Order == "VOS", measure == "entropy UID")$score),
  "VSO", mean(filter(anova_df_allUtts, Word_Order == "VSO", measure == "entropy UID")$score),
  "SOV", mean(filter(anova_df_allUtts, Word_Order == "SOV", measure == "entropy UID")$score),
  "SVO", mean(filter(anova_df_allUtts, Word_Order == "SVO", measure == "entropy UID")$score)
) %>% mutate(rank = min_rank(score)) %>% arrange(rank)

oneway.test(score ~ Word_Order,
            data = filter(anova_df_allUtts, measure == "entropy UID"),
            var.equal=FALSE)

oneway.test(score ~ Word_Order,
            data = filter(anova_df_allUtts, measure == "surprisal UID"),
            var.equal=FALSE)




big_table_o_data %>% 
  filter(measure == "entropy UID") %>% group_by(language) %>%
  mutate(chart_rank = as.factor(rank(score, ties.method = "random"))) %>%
  ggplot(mapping = aes(x = language, y = chart_rank, fill = word_order, label = chart_rank)) +
  geom_bar(stat = "identity", position = "stack") +
  scale_fill_manual(values = c("#000000", "#E69F00", "#56B4E9", "#009E73", "#F0E442", "#0072B2", "#D55E00", "#CC79A7"))
# scale_y_reverse()

big_table_o_data %>% 
  filter(measure == "surprisal UID") %>% group_by(language) %>%
  mutate(chart_rank = as.factor(rank(score, ties.method = "random"))) %>%
  ggplot(mapping = aes(x = language, y = chart_rank, fill = word_order, label = chart_rank)) +
  geom_bar(stat = "identity", position = "stack") +
  scale_fill_manual(values = c("#000000", "#E69F00", "#56B4E9", "#009E73", "#F0E442", "#0072B2", "#D55E00", "#CC79A7"))
# scale_y_reverse()

map_df(langs, function(l) {
  map_df(unique(filter(english, str_detect(language, "subset"))$language), function(sub, df) {
    subsetEnts <- calcEntRankings(filter(df, language == sub)) %>% left_join(rename(pivot_longer(meta, c("SVO", "SOV", "VSO", "VOS", "OVS", "OSV"), names_to = "word_order", values_to = "counts"), language = Language), by = c("language", "word_order")) %>%
      mutate(prop = 100*counts/Tokens)
    subsetSurps <- calcSurpRankings(filter(df, language == sub)) %>% left_join(rename(pivot_longer(meta, c("SVO", "SOV", "VSO", "VOS", "OVS", "OSV"), names_to = "word_order", values_to = "counts"), language = Language), by = c("language", "word_order")) %>%
      mutate(prop = 100*counts/Tokens)
    subsetMIs <- calcMIRankings(filter(df, language == sub)) %>% left_join(rename(pivot_longer(meta, c("SVO", "SOV", "VSO", "VOS", "OVS", "OSV"), names_to = "word_order", values_to = "counts"), language = Language), by = c("language", "word_order")) %>%
      mutate(prop = 100*counts/Tokens)
    correls <- tribble(
      ~lang_subset, ~measure, ~correlation,
      sub, "entropy UID", cor(subsetEnts$rank, subsetEnts$prop),
      sub, "surprisal UID", cor(subsetSurps$rank, subsetEnts$prop),
      sub, "mutual info", cor(subsetMIs$rank, subsetEnts$prop)
    )
  }, df=l)
})
  
  
  
  
  
  
  
  
  
  
  (big_table_o_data <- add_column(big_table_o_data, proportion = c(childes_meta$SVO/childes_meta$Tokens, childes_meta$SOV/childes_meta$Tokens, childes_meta$VSO/childes_meta$Tokens, childes_meta$VOS/childes_meta$Tokens, childes_meta$OVS/childes_meta$Tokens, childes_meta$OSV/childes_meta$Tokens,
                                                                   childes_meta$SVO/childes_meta$Tokens, childes_meta$SOV/childes_meta$Tokens, childes_meta$VSO/childes_meta$Tokens, childes_meta$VOS/childes_meta$Tokens, childes_meta$OVS/childes_meta$Tokens, childes_meta$OSV/childes_meta$Tokens,
                                                                   childes_meta$SVO/childes_meta$Tokens, childes_meta$SOV/childes_meta$Tokens, childes_meta$VSO/childes_meta$Tokens, childes_meta$VOS/childes_meta$Tokens, childes_meta$OVS/childes_meta$Tokens, childes_meta$OSV/childes_meta$Tokens,
                                                                   breton_meta$SVO/breton_meta$Tokens, breton_meta$SOV/breton_meta$Tokens, breton_meta$VSO/breton_meta$Tokens, breton_meta$VOS/breton_meta$Tokens, breton_meta$OVS/breton_meta$Tokens, breton_meta$OSV/breton_meta$Tokens,
                                                                   breton_meta$SVO/breton_meta$Tokens, breton_meta$SOV/breton_meta$Tokens, breton_meta$VSO/breton_meta$Tokens, breton_meta$VOS/breton_meta$Tokens, breton_meta$OVS/breton_meta$Tokens, breton_meta$OSV/breton_meta$Tokens,
                                                                   breton_meta$SVO/breton_meta$Tokens, breton_meta$SOV/breton_meta$Tokens, breton_meta$VSO/breton_meta$Tokens, breton_meta$VOS/breton_meta$Tokens, breton_meta$OVS/breton_meta$Tokens, breton_meta$OSV/breton_meta$Tokens,
                                                                   welsh_meta$SVO/welsh_meta$Tokens, welsh_meta$SOV/welsh_meta$Tokens, welsh_meta$VSO/welsh_meta$Tokens, welsh_meta$VOS/welsh_meta$Tokens, welsh_meta$OVS/welsh_meta$Tokens, welsh_meta$OSV/welsh_meta$Tokens,
                                                                   welsh_meta$SVO/welsh_meta$Tokens, welsh_meta$SOV/welsh_meta$Tokens, welsh_meta$VSO/welsh_meta$Tokens, welsh_meta$VOS/welsh_meta$Tokens, welsh_meta$OVS/welsh_meta$Tokens, welsh_meta$OSV/welsh_meta$Tokens,
                                                                   welsh_meta$SVO/welsh_meta$Tokens, welsh_meta$SOV/welsh_meta$Tokens, welsh_meta$VSO/welsh_meta$Tokens, welsh_meta$VOS/welsh_meta$Tokens, welsh_meta$OVS/welsh_meta$Tokens, welsh_meta$OSV/welsh_meta$Tokens,
                                                                   german_meta$SVO/german_meta$Tokens, german_meta$SOV/german_meta$Tokens, german_meta$VSO/german_meta$Tokens, german_meta$VOS/german_meta$Tokens, german_meta$OVS/german_meta$Tokens, german_meta$OSV/german_meta$Tokens,
                                                                   german_meta$SVO/german_meta$Tokens, german_meta$SOV/german_meta$Tokens, german_meta$VSO/german_meta$Tokens, german_meta$VOS/german_meta$Tokens, german_meta$OVS/german_meta$Tokens, german_meta$OSV/german_meta$Tokens,
                                                                   german_meta$SVO/german_meta$Tokens, german_meta$SOV/german_meta$Tokens, german_meta$VSO/german_meta$Tokens, german_meta$VOS/german_meta$Tokens, german_meta$OVS/german_meta$Tokens, german_meta$OSV/german_meta$Tokens,
                                                                   english_meta$SVO/english_meta$Tokens, english_meta$SOV/english_meta$Tokens, english_meta$VSO/english_meta$Tokens, english_meta$VOS/english_meta$Tokens, english_meta$OVS/english_meta$Tokens, english_meta$OSV/english_meta$Tokens,
                                                                   english_meta$SVO/english_meta$Tokens, english_meta$SOV/english_meta$Tokens, english_meta$VSO/english_meta$Tokens, english_meta$VOS/english_meta$Tokens, english_meta$OVS/english_meta$Tokens, english_meta$OSV/english_meta$Tokens,
                                                                   english_meta$SVO/english_meta$Tokens, english_meta$SOV/english_meta$Tokens, english_meta$VSO/english_meta$Tokens, english_meta$VOS/english_meta$Tokens, english_meta$OVS/english_meta$Tokens, english_meta$OSV/english_meta$Tokens,
                                                                   basque_meta$SVO/basque_meta$Tokens, basque_meta$SOV/basque_meta$Tokens, basque_meta$VSO/basque_meta$Tokens, basque_meta$VOS/basque_meta$Tokens, basque_meta$OVS/basque_meta$Tokens, basque_meta$OSV/basque_meta$Tokens,
                                                                   basque_meta$SVO/basque_meta$Tokens, basque_meta$SOV/basque_meta$Tokens, basque_meta$VSO/basque_meta$Tokens, basque_meta$VOS/basque_meta$Tokens, basque_meta$OVS/basque_meta$Tokens, basque_meta$OSV/basque_meta$Tokens,
                                                                   basque_meta$SVO/basque_meta$Tokens, basque_meta$SOV/basque_meta$Tokens, basque_meta$VSO/basque_meta$Tokens, basque_meta$VOS/basque_meta$Tokens, basque_meta$OVS/basque_meta$Tokens, basque_meta$OSV/basque_meta$Tokens,
                                                                   irish_meta$SVO/irish_meta$Tokens, irish_meta$SOV/irish_meta$Tokens, irish_meta$VSO/irish_meta$Tokens, irish_meta$VOS/irish_meta$Tokens, irish_meta$OVS/irish_meta$Tokens, irish_meta$OSV/irish_meta$Tokens,
                                                                   irish_meta$SVO/irish_meta$Tokens, irish_meta$SOV/irish_meta$Tokens, irish_meta$VSO/irish_meta$Tokens, irish_meta$VOS/irish_meta$Tokens, irish_meta$OVS/irish_meta$Tokens, irish_meta$OSV/irish_meta$Tokens,
                                                                   irish_meta$SVO/irish_meta$Tokens, irish_meta$SOV/irish_meta$Tokens, irish_meta$VSO/irish_meta$Tokens, irish_meta$VOS/irish_meta$Tokens, irish_meta$OVS/irish_meta$Tokens, irish_meta$OSV/irish_meta$Tokens,
                                                                   scottish_gaelic_meta$SVO/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$SOV/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$VSO/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$VOS/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$OVS/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$OSV/scottish_gaelic_meta$Tokens,
                                                                   scottish_gaelic_meta$SVO/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$SOV/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$VSO/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$VOS/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$OVS/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$OSV/scottish_gaelic_meta$Tokens,
                                                                   scottish_gaelic_meta$SVO/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$SOV/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$VSO/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$VOS/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$OVS/scottish_gaelic_meta$Tokens, scottish_gaelic_meta$OSV/scottish_gaelic_meta$Tokens,
                                                                   hindi_meta$SVO/hindi_meta$Tokens, hindi_meta$SOV/hindi_meta$Tokens, hindi_meta$VSO/hindi_meta$Tokens, hindi_meta$VOS/hindi_meta$Tokens, hindi_meta$OVS/hindi_meta$Tokens, hindi_meta$OSV/hindi_meta$Tokens,
                                                                   hindi_meta$SVO/hindi_meta$Tokens, hindi_meta$SOV/hindi_meta$Tokens, hindi_meta$VSO/hindi_meta$Tokens, hindi_meta$VOS/hindi_meta$Tokens, hindi_meta$OVS/hindi_meta$Tokens, hindi_meta$OSV/hindi_meta$Tokens,
                                                                   hindi_meta$SVO/hindi_meta$Tokens, hindi_meta$SOV/hindi_meta$Tokens, hindi_meta$VSO/hindi_meta$Tokens, hindi_meta$VOS/hindi_meta$Tokens, hindi_meta$OVS/hindi_meta$Tokens, hindi_meta$OSV/hindi_meta$Tokens,
                                                                   hungarian_meta$SVO/hungarian_meta$Tokens, hungarian_meta$SOV/hungarian_meta$Tokens, hungarian_meta$VSO/hungarian_meta$Tokens, hungarian_meta$VOS/hungarian_meta$Tokens, hungarian_meta$OVS/hungarian_meta$Tokens, hungarian_meta$OSV/hungarian_meta$Tokens,
                                                                   hungarian_meta$SVO/hungarian_meta$Tokens, hungarian_meta$SOV/hungarian_meta$Tokens, hungarian_meta$VSO/hungarian_meta$Tokens, hungarian_meta$VOS/hungarian_meta$Tokens, hungarian_meta$OVS/hungarian_meta$Tokens, hungarian_meta$OSV/hungarian_meta$Tokens,
                                                                   hungarian_meta$SVO/hungarian_meta$Tokens, hungarian_meta$SOV/hungarian_meta$Tokens, hungarian_meta$VSO/hungarian_meta$Tokens, hungarian_meta$VOS/hungarian_meta$Tokens, hungarian_meta$OVS/hungarian_meta$Tokens, hungarian_meta$OSV/hungarian_meta$Tokens,
                                                                   indonesian_meta$SVO/indonesian_meta$Tokens, indonesian_meta$SOV/indonesian_meta$Tokens, indonesian_meta$VSO/indonesian_meta$Tokens, indonesian_meta$VOS/indonesian_meta$Tokens, indonesian_meta$OVS/indonesian_meta$Tokens, indonesian_meta$OSV/indonesian_meta$Tokens,
                                                                   indonesian_meta$SVO/indonesian_meta$Tokens, indonesian_meta$SOV/indonesian_meta$Tokens, indonesian_meta$VSO/indonesian_meta$Tokens, indonesian_meta$VOS/indonesian_meta$Tokens, indonesian_meta$OVS/indonesian_meta$Tokens, indonesian_meta$OSV/indonesian_meta$Tokens,
                                                                   indonesian_meta$SVO/indonesian_meta$Tokens, indonesian_meta$SOV/indonesian_meta$Tokens, indonesian_meta$VSO/indonesian_meta$Tokens, indonesian_meta$VOS/indonesian_meta$Tokens, indonesian_meta$OVS/indonesian_meta$Tokens, indonesian_meta$OSV/indonesian_meta$Tokens,
                                                                   japanese_meta$SVO/japanese_meta$Tokens, japanese_meta$SOV/japanese_meta$Tokens, japanese_meta$VSO/japanese_meta$Tokens, japanese_meta$VOS/japanese_meta$Tokens, japanese_meta$OVS/japanese_meta$Tokens, japanese_meta$OSV/japanese_meta$Tokens,
                                                                   japanese_meta$SVO/japanese_meta$Tokens, japanese_meta$SOV/japanese_meta$Tokens, japanese_meta$VSO/japanese_meta$Tokens, japanese_meta$VOS/japanese_meta$Tokens, japanese_meta$OVS/japanese_meta$Tokens, japanese_meta$OSV/japanese_meta$Tokens,
                                                                   japanese_meta$SVO/japanese_meta$Tokens, japanese_meta$SOV/japanese_meta$Tokens, japanese_meta$VSO/japanese_meta$Tokens, japanese_meta$VOS/japanese_meta$Tokens, japanese_meta$OVS/japanese_meta$Tokens, japanese_meta$OSV/japanese_meta$Tokens,
                                                                   korean_meta$SVO/korean_meta$Tokens, korean_meta$SOV/korean_meta$Tokens, korean_meta$VSO/korean_meta$Tokens, korean_meta$VOS/korean_meta$Tokens, korean_meta$OVS/korean_meta$Tokens, korean_meta$OSV/korean_meta$Tokens,
                                                                   korean_meta$SVO/korean_meta$Tokens, korean_meta$SOV/korean_meta$Tokens, korean_meta$VSO/korean_meta$Tokens, korean_meta$VOS/korean_meta$Tokens, korean_meta$OVS/korean_meta$Tokens, korean_meta$OSV/korean_meta$Tokens,
                                                                   korean_meta$SVO/korean_meta$Tokens, korean_meta$SOV/korean_meta$Tokens, korean_meta$VSO/korean_meta$Tokens, korean_meta$VOS/korean_meta$Tokens, korean_meta$OVS/korean_meta$Tokens, korean_meta$OSV/korean_meta$Tokens,
                                                                   mbya_guarani_meta$SVO/mbya_guarani_meta$Tokens, mbya_guarani_meta$SOV/mbya_guarani_meta$Tokens, mbya_guarani_meta$VSO/mbya_guarani_meta$Tokens, mbya_guarani_meta$VOS/mbya_guarani_meta$Tokens, mbya_guarani_meta$OVS/mbya_guarani_meta$Tokens, mbya_guarani_meta$OSV/mbya_guarani_meta$Tokens,
                                                                   mbya_guarani_meta$SVO/mbya_guarani_meta$Tokens, mbya_guarani_meta$SOV/mbya_guarani_meta$Tokens, mbya_guarani_meta$VSO/mbya_guarani_meta$Tokens, mbya_guarani_meta$VOS/mbya_guarani_meta$Tokens, mbya_guarani_meta$OVS/mbya_guarani_meta$Tokens, mbya_guarani_meta$OSV/mbya_guarani_meta$Tokens,
                                                                   mbya_guarani_meta$SVO/mbya_guarani_meta$Tokens, mbya_guarani_meta$SOV/mbya_guarani_meta$Tokens, mbya_guarani_meta$VSO/mbya_guarani_meta$Tokens, mbya_guarani_meta$VOS/mbya_guarani_meta$Tokens, mbya_guarani_meta$OVS/mbya_guarani_meta$Tokens, mbya_guarani_meta$OSV/mbya_guarani_meta$Tokens,
                                                                   dutch_meta$SVO/dutch_meta$Tokens, dutch_meta$SOV/dutch_meta$Tokens, dutch_meta$VSO/dutch_meta$Tokens, dutch_meta$VOS/dutch_meta$Tokens, dutch_meta$OVS/dutch_meta$Tokens, dutch_meta$OSV/dutch_meta$Tokens,
                                                                   dutch_meta$SVO/dutch_meta$Tokens, dutch_meta$SOV/dutch_meta$Tokens, dutch_meta$VSO/dutch_meta$Tokens, dutch_meta$VOS/dutch_meta$Tokens, dutch_meta$OVS/dutch_meta$Tokens, dutch_meta$OSV/dutch_meta$Tokens,
                                                                   dutch_meta$SVO/dutch_meta$Tokens, dutch_meta$SOV/dutch_meta$Tokens, dutch_meta$VSO/dutch_meta$Tokens, dutch_meta$VOS/dutch_meta$Tokens, dutch_meta$OVS/dutch_meta$Tokens, dutch_meta$OSV/dutch_meta$Tokens,
                                                                   tagalog_meta$SVO/tagalog_meta$Tokens, tagalog_meta$SOV/tagalog_meta$Tokens, tagalog_meta$VSO/tagalog_meta$Tokens, tagalog_meta$VOS/tagalog_meta$Tokens, tagalog_meta$OVS/tagalog_meta$Tokens, tagalog_meta$OSV/tagalog_meta$Tokens,
                                                                   tagalog_meta$SVO/tagalog_meta$Tokens, tagalog_meta$SOV/tagalog_meta$Tokens, tagalog_meta$VSO/tagalog_meta$Tokens, tagalog_meta$VOS/tagalog_meta$Tokens, tagalog_meta$OVS/tagalog_meta$Tokens, tagalog_meta$OSV/tagalog_meta$Tokens,
                                                                   tagalog_meta$SVO/tagalog_meta$Tokens, tagalog_meta$SOV/tagalog_meta$Tokens, tagalog_meta$VSO/tagalog_meta$Tokens, tagalog_meta$VOS/tagalog_meta$Tokens, tagalog_meta$OVS/tagalog_meta$Tokens, tagalog_meta$OSV/tagalog_meta$Tokens,
                                                                   turkish_meta$SVO/turkish_meta$Tokens, turkish_meta$SOV/turkish_meta$Tokens, turkish_meta$VSO/turkish_meta$Tokens, turkish_meta$VOS/turkish_meta$Tokens, turkish_meta$OVS/turkish_meta$Tokens, turkish_meta$OSV/turkish_meta$Tokens,
                                                                   turkish_meta$SVO/turkish_meta$Tokens, turkish_meta$SOV/turkish_meta$Tokens, turkish_meta$VSO/turkish_meta$Tokens, turkish_meta$VOS/turkish_meta$Tokens, turkish_meta$OVS/turkish_meta$Tokens, turkish_meta$OSV/turkish_meta$Tokens,
                                                                   turkish_meta$SVO/turkish_meta$Tokens, turkish_meta$SOV/turkish_meta$Tokens, turkish_meta$VSO/turkish_meta$Tokens, turkish_meta$VOS/turkish_meta$Tokens, turkish_meta$OVS/turkish_meta$Tokens, turkish_meta$OSV/turkish_meta$Tokens,
                                                                   vietnamese_meta$SVO/vietnamese_meta$Tokens, vietnamese_meta$SOV/vietnamese_meta$Tokens, vietnamese_meta$VSO/vietnamese_meta$Tokens, vietnamese_meta$VOS/vietnamese_meta$Tokens, vietnamese_meta$OVS/vietnamese_meta$Tokens, vietnamese_meta$OSV/vietnamese_meta$Tokens,
                                                                   vietnamese_meta$SVO/vietnamese_meta$Tokens, vietnamese_meta$SOV/vietnamese_meta$Tokens, vietnamese_meta$VSO/vietnamese_meta$Tokens, vietnamese_meta$VOS/vietnamese_meta$Tokens, vietnamese_meta$OVS/vietnamese_meta$Tokens, vietnamese_meta$OSV/vietnamese_meta$Tokens,
                                                                   vietnamese_meta$SVO/vietnamese_meta$Tokens, vietnamese_meta$SOV/vietnamese_meta$Tokens, vietnamese_meta$VSO/vietnamese_meta$Tokens, vietnamese_meta$VOS/vietnamese_meta$Tokens, vietnamese_meta$OVS/vietnamese_meta$Tokens, vietnamese_meta$OSV/vietnamese_meta$Tokens,
                                                                   warlpiri_meta$SVO/warlpiri_meta$Tokens, warlpiri_meta$SOV/warlpiri_meta$Tokens, warlpiri_meta$VSO/warlpiri_meta$Tokens, warlpiri_meta$VOS/warlpiri_meta$Tokens, warlpiri_meta$OVS/warlpiri_meta$Tokens, warlpiri_meta$OSV/warlpiri_meta$Tokens,
                                                                   warlpiri_meta$SVO/warlpiri_meta$Tokens, warlpiri_meta$SOV/warlpiri_meta$Tokens, warlpiri_meta$VSO/warlpiri_meta$Tokens, warlpiri_meta$VOS/warlpiri_meta$Tokens, warlpiri_meta$OVS/warlpiri_meta$Tokens, warlpiri_meta$OSV/warlpiri_meta$Tokens,
                                                                   warlpiri_meta$SVO/warlpiri_meta$Tokens, warlpiri_meta$SOV/warlpiri_meta$Tokens, warlpiri_meta$VSO/warlpiri_meta$Tokens, warlpiri_meta$VOS/warlpiri_meta$Tokens, warlpiri_meta$OVS/warlpiri_meta$Tokens, warlpiri_meta$OSV/warlpiri_meta$Tokens,
                                                                   wolof_meta$SVO/wolof_meta$Tokens, wolof_meta$SOV/wolof_meta$Tokens, wolof_meta$VSO/wolof_meta$Tokens, wolof_meta$VOS/wolof_meta$Tokens, wolof_meta$OVS/wolof_meta$Tokens, wolof_meta$OSV/wolof_meta$Tokens,
                                                                   wolof_meta$SVO/wolof_meta$Tokens, wolof_meta$SOV/wolof_meta$Tokens, wolof_meta$VSO/wolof_meta$Tokens, wolof_meta$VOS/wolof_meta$Tokens, wolof_meta$OVS/wolof_meta$Tokens, wolof_meta$OSV/wolof_meta$Tokens,
                                                                   wolof_meta$SVO/wolof_meta$Tokens, wolof_meta$SOV/wolof_meta$Tokens, wolof_meta$VSO/wolof_meta$Tokens, wolof_meta$VOS/wolof_meta$Tokens, wolof_meta$OVS/wolof_meta$Tokens, wolof_meta$OSV/wolof_meta$Tokens,
                                                                   mandarin_meta$SVO/mandarin_meta$Tokens, mandarin_meta$SOV/mandarin_meta$Tokens, mandarin_meta$VSO/mandarin_meta$Tokens, mandarin_meta$VOS/mandarin_meta$Tokens, mandarin_meta$OVS/mandarin_meta$Tokens, mandarin_meta$OSV/mandarin_meta$Tokens,
                                                                   mandarin_meta$SVO/mandarin_meta$Tokens, mandarin_meta$SOV/mandarin_meta$Tokens, mandarin_meta$VSO/mandarin_meta$Tokens, mandarin_meta$VOS/mandarin_meta$Tokens, mandarin_meta$OVS/mandarin_meta$Tokens, mandarin_meta$OSV/mandarin_meta$Tokens,
                                                                   mandarin_meta$SVO/mandarin_meta$Tokens, mandarin_meta$SOV/mandarin_meta$Tokens, mandarin_meta$VSO/mandarin_meta$Tokens, mandarin_meta$VOS/mandarin_meta$Tokens, mandarin_meta$OVS/mandarin_meta$Tokens, mandarin_meta$OSV/mandarin_meta$Tokens)))

cor(mutate(filter(big_table_o_data, measure == "entropy UID"), inv_score = 1/score)$inv_score, filter(big_table_o_data, measure == "entropy UID")$proportion)
cor(mutate(filter(big_table_o_data, measure == "surprisal UID"), inv_score = 1/score)$inv_score, filter(big_table_o_data, measure == "surprisal UID")$proportion)
cor(filter(big_table_o_data, measure == "mi")$score, filter(big_table_o_data, measure == "mi")$proportion)

cor.test(mutate(filter(big_table_o_data, measure == "entropy UID"), inv_score = 1/score)$inv_score, filter(big_table_o_data, measure == "entropy UID")$proportion, method = "spearman")
cor.test(mutate(filter(big_table_o_data, measure == "surprisal UID"), inv_score = 1/score)$inv_score, filter(big_table_o_data, measure == "surprisal UID")$proportion, method = "spearman")
cor.test(filter(big_table_o_data, measure == "mi")$score, filter(big_table_o_data, measure == "mi")$proportion, method = "spearman")

c("English CHILDES", "Breton", "Welsh", "German", "English", "Basque", "Irish", "Scottish Gaelic", "Hindi", "Hungarian", "Indonesian", "Japanese", "Korean", "Mbya Guarani", "Dutch", "Tagalog", "Turkish", "Vietnamese", "Warlpiri", "Wolof", "Mandarin") %>% map(function(lang) {
  c("entropy UID", "surprisal UID", "mi") %>% map(function(m, l) {
    if(m == "mi") {
      #  cor(filter(big_table_o_data, language == l, measure == m)$score, filter(big_table_o_data, language == l, measure == m)$proportion)
      cor.test(filter(big_table_o_data, language == l, measure == m)$score, filter(big_table_o_data, language == l, measure == m)$proportion, method = "spearman")
    } else {
      #  cor(mutate(filter(big_table_o_data, language == l, measure == m), inv_score = 1/score)$inv_score, filter(big_table_o_data, language == l, measure == m)$proportion)
      cor.test(mutate(filter(big_table_o_data, language == l, measure == m), inv_score = 1/score)$inv_score, filter(big_table_o_data, language == l, measure == m)$proportion, method = "spearman")
    }
  }, l = lang)
})

correls <- tribble(
  ~language, ~measure, ~r, ~dom_order,
  "English CHILDES", "entropy UID", 0.6324682, "SVO",
  "Breton", "entropy UID", 0.3845503, "VSO",
  "Welsh", "entropy UID", 0.4459809, "VSO",
  "German", "entropy UID", -0.3007341, "None",
  "English", "entropy UID", 0.4547007, "SVO",
  "Basque", "entropy UID", -0.5775454, "SOV",
  "Irish", "entropy UID", 0.3329745, "VSO",
  "Scottish Gaelic", "entropy UID", 0.1625653, "VSO",
  "Hindi", "entropy UID", -0.3473683, "SOV",
  "Hungarian", "entropy UID", -0.582591, "None",
  "Indonesian", "entropy UID", 0.1793664, "SVO",
  "Japanese", "entropy UID", -0.4598236, "SOV",
  "Korean", "entropy UID", 0.5851102, "SOV",
  "Mbya Guarani", "entropy UID", -0.1709232, "SVO",
  "Dutch", "entropy UID", 0.2856145, "None",
  "Tagalog", "entropy UID", 0.1505849, "VSO",
  "Turkish", "entropy UID", -0.2680761, "SOV",
  "Vietnamese", "entropy UID", 0.3060113, "SVO",
  "Warlpiri", "entropy UID", 0.6680841, "None",
  "Wolof", "entropy UID", 0.7386079, "SVO",
  "Mandarin", "entropy UID", -0.04177955, "SVO",
  "English CHILDES", "surprisal UID", -0.03464062, "SVO",
  "Breton", "surprisal UID", 0.3663543, "VSO",
  "Welsh", "surprisal UID", 0.4459809, "VSO",
  "German", "surprisal UID", -0.8078796, "None",
  "English", "surprisal UID", -0.485443, "SVO",
  "Basque", "surprisal UID", -0.6199609, "SOV",
  "Irish", "surprisal UID", 0.7228481, "VSO",
  "Scottish Gaelic", "surprisal UID", 0.6934322, "VSO",
  "Hindi", "surprisal UID", -0.3608037, "SOV",
  "Hungarian", "surprisal UID", -0.5824678, "None",
  "Indonesian", "surprisal UID", -0.2601404, "SVO",
  "Japanese", "surprisal UID", -0.4456583, "SOV",
  "Korean", "surprisal UID", 0.5815809, "SOV",
  "Mbya Guarani", "surprisal UID", -0.1709232, "SVO",
  "Dutch", "surprisal UID", -0.8701938, "None",
  "Tagalog", "surprisal UID", 0.1895209, "VSO",
  "Turkish", "surprisal UID", -0.3258963, "SOV",
  "Vietnamese", "surprisal UID", 0.3730164, "SVO",
  "Warlpiri", "surprisal UID", 0.6526612, "None",
  "Wolof", "surprisal UID", -0.6759722, "SVO",
  "Mandarin", "surprisal UID", -0.2288886, "SVO",
  "English CHILDES", "mutual info", 0.1739146, "SVO",
  "Breton", "mutual info", -0.5861659, "VSO",
  "Welsh", "mutual info", -0.4710567, "VSO",
  "German", "mutual info", 0.1677536, "None",
  "English", "mutual info", -0.09812509, "SVO",
  "Basque", "mutual info", -0.07265581, "SOV",
  "Irish", "mutual info", -0.4303142, "VSO",
  "Scottish Gaelic", "mutual info", -0.4531177, "VSO",
  "Hindi", "mutual info", 0.009769402, "SOV",
  "Hungarian", "mutual info", -0.4654166, "None",
  "Indonesian", "mutual info", -0.4160634, "SVO",
  "Japanese", "mutual info", 0.3751736, "SOV",
  "Korean", "mutual info", 0.08761783, "SOV",
  "Mbya Guarani", "mutual info", -0.1135553, "SVO",
  "Dutch", "mutual info", 0.1347135, "None",
  "Tagalog", "mutual info", -0.6032506, "VSO",
  "Turkish", "mutual info", 0.4514237, "SOV",
  "Vietnamese", "mutual info", -0.2892723, "SVO",
  "Warlpiri", "mutual info", 0.2070285, "None",
  "Wolof", "mutual info", 0.3350923, "SVO",
  "Mandarin", "mutual info", -0.5600294, "SVO"
) %>% arrange(dom_order)

ggplot(data = filter(correls, dom_order == "SVO")) +
  geom_bar(mapping = aes(x = language, y = r, fill = dom_order), stat = "identity") +
  ylim(-1, 1) +
  facet_wrap(~ measure) +
  theme(axis.text.x = element_text(angle = 45, vjust = 1, hjust=1))

ggplot(data = filter(correls, dom_order == "SOV")) +
  geom_bar(mapping = aes(x = language, y = r, fill = dom_order), stat = "identity") +
  ylim(-1, 1) +
  facet_wrap(~ measure) +
  theme(axis.text.x = element_text(angle = 45, vjust = 1, hjust=1)) +
  scale_fill_manual(values = "#7CAE00")

ggplot(data = filter(correls, dom_order == "VSO")) +
  geom_bar(mapping = aes(x = language, y = r, fill = dom_order), stat = "identity") +
  ylim(-1, 1) +
  facet_wrap(~ measure) +
  theme(axis.text.x = element_text(angle = 45, vjust = 1, hjust=1)) +
  scale_fill_manual(values = "#C77CFF")

ggplot(data = filter(correls, dom_order == "None")) +
  geom_bar(mapping = aes(x = language, y = r, fill = dom_order), stat = "identity") +
  ylim(-1, 1) +
  facet_wrap(~ measure) +
  theme(axis.text.x = element_text(angle = 45, vjust = 1, hjust=1)) +
  scale_fill_manual(values = "#00BFC4")

ggplot(data = filter(correls, measure == "mi")) +
  geom_bar(mapping = aes(x = language, y = r, fill = dom_order), stat = "identity") +
  ylim(-1, 1) +
  facet_wrap(~ dom_order) +
  theme(axis.text.x = element_text(angle = 45, vjust = 1, hjust=1))

ggplot(data = big_table_o_data) +
  geom_point(mapping = aes(x = score, y = proportion, color = word_order), position = "jitter") +
  facet_grid(measure ~ language)

(tb <- tribble(
  ~order, ~count,
  "SOV", 565,
  "SVO", 488,
  "VSO", 95,
  "VOS", 25,
  "OVS", 11,
  "OSV", 4) %>% mutate(prop = count/sum(count)) %>% 
    add_column(entropy_uid = c(sov_agg_ent, svo_agg_ent, vso_agg_ent, vos_agg_ent, ovs_agg_ent, osv_agg_ent)) %>%
    mutate(entropy_uid = 1-entropy_uid) %>%
    mutate(entropy_uid = entropy_uid/sum(entropy_uid)) %>%
    add_column(surprisal_uid = c(sov_agg_surp, svo_agg_surp, vso_agg_surp, vos_agg_surp, ovs_agg_surp, osv_agg_surp)) %>%
    mutate(surprisal_uid = 1-surprisal_uid) %>%
    mutate(surprisal_uid = surprisal_uid/sum(surprisal_uid)) %>%
    add_column(mutual_info = c(sov_agg_mi, svo_agg_mi, vso_agg_mi, vos_agg_mi, ovs_agg_mi, osv_agg_mi)) %>%
    mutate(mutual_info = mutual_info/sum(mutual_info)) %>%
    mutate(mutual_info = 1-mutual_info) %>%
    mutate(mutual_info = mutual_info/sum(mutual_info))
)
tb$order <- factor(tb$order, levels = c("SOV", "SVO", "VSO", "VOS", "OVS", "OSV"))

cbbPalette <- c("#000000", "#E69F00", "#56B4E9", "#009E73", "#F0E442", "#0072B2", "#D55E00", "#CC79A7")

toyworld <- read_csv("G:\\My Drive\\Academic Work\\UCD\\2019 - 2020\\Prelim paper\\Results\\toyworld-results.csv") %>%
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

get_legend<-function(myggplot){
  tmp <- ggplot_gtable(ggplot_build(myggplot))
  leg <- which(sapply(tmp$grobs, function(x) x$name) == "guide-box")
  legend <- tmp$grobs[[leg]]
  return(legend)
}

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

grid.arrange(fig2a + 
               theme(legend.position = "none",
                     plot.margin = unit(c(0,1.75,0,1), "lines")), 
             fig2b + 
               theme(plot.margin = unit(c(0,1,0,1.75), "lines")), 
             fig2_leg, ncol = 2, nrow = 2, 
             layout_matrix = rbind(c(1,2), c(3,3)),
             heights = c(5, 1))


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

grid.arrange(fig3a + 
               theme(legend.position = "none",
                     plot.margin = unit(c(0,0.75,0,1), "lines")), 
             fig3b + 
               theme(plot.margin = unit(c(0,1,0,0.75), "lines")), 
             fig3_leg, ncol = 2, nrow = 2, 
             layout_matrix = rbind(c(1,2), c(3,3)),
             heights = c(5, 1.5))

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

# line graph version of overall trend
ggplot(data = df, mapping = aes(x = order, y = prop, linetype=measure, shape=measure, color=measure, group = measure, size = measure)) +
  geom_point(data = filter(df, measure == "entropy-based UID"), size = 7.75) +
  geom_point(data = filter(df, measure == "WALS classification"), size = 5.25) +
  geom_point(data = filter(df, measure == "surprisal-based UID"), size = 4.25) +
  geom_point(data = filter(df, measure == "mutual information"), size = 5.25) +
    geom_line() +
  scale_linetype_manual(breaks=c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"), values = c("dashed", "twodash", "dotted", "solid")) +
    scale_shape_manual(breaks=c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"), values = c(18,17,15,16)) +
   scale_color_manual(breaks=c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"), values=cbbPalette) +
  scale_size_manual(breaks=c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"), values = c(2.75, 2.75, 3.5, 3.5)) +
    scale_y_continuous(limits = c(0,0.5), breaks = c(0,0.1,0.2,0.3,0.4,0.5), labels = c("0", "10", "20", "30", "40", "50")) +
    labs(x = "Word order", y = "Proportion (%)", color = "Measure", linetype="Measure", shape = "Measure", size = "Measure") +
    theme(legend.position = c(0.82, 0.75), 
          #legend.key.width = unit(3.5, "lines"), 
          text=element_text(size=24), 
          panel.background = element_rect(fill = "white", color = "grey"),
          panel.grid.major = element_line(color = "slategrey", size = 0.7),
          panel.grid.minor.y = element_line(color = "grey"),
          panel.grid.minor.x = element_line(color = "white"),
          axis.title.x = element_text(margin = margin(t = 6)),
          axis.title.y = element_text(margin = margin(r = 10))) +
    guides(linetype=guide_legend(keywidth = 5.5, keyheight = 1))

df$measure <- factor(df$measure, levels = c("WALS classification", "entropy-based UID", "surprisal-based UID", "mutual information"))
# bar chart version
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
  "Eve", -log2(0.2),#filter(toyworld, Event == "eve eat bread", Word_Order == "SVO") %>% .$I1,
  "ate", -log2(0.5),#filter(toyworld, Event == "eve eat bread", Word_Order == "VSO") %>% .$I1,
  "bread", -log2(0.05),#filter(toyworld, Event == "eve eat bread", Word_Order == "OVS") %>% .$I1,
  "rice", -log2(0.23)#filter(toyworld, Event == "eve eat rice", Word_Order == "OVS") %>% .$I1
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

grid.arrange(spacer, sov_title, svo_title, vso_title,
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
                                  c(16,16,16,16,16,16,16,16,16,16,16,16,16,16)))

#grid.arrange(spacer, sov_title, svo_title, vso_title,
#             bread_text,
#             rice_text,
#             line,
#             sov_bread, sov_rice,
#             line,
#             svo_bread, svo_rice,
#             line,
#             vso_rice, vso_rice,
#             mi_leg,
#             line,
#             nrow = 4, ncol = 12,
#             widths = unit(c(6,3,3,7,1,3.25,9.25,1,3.25,9.5,2.25,1), "lines"),
#             heights = unit(c(1.9,7.5,7.5,4), "lines"),
#             layout_matrix = rbind(c(1,1,2,2,2,1,3,3,1,4,4,1),
#                                   c(5,7,8,8,1,10,11,11,13,14,14,17), 
#                                   c(6,7,1,9,9,10,12,1,13,15,1,17),
#                                   c(16,16,16,16,16,16,16,16,16,16,16,16)))

