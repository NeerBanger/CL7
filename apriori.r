library(arules)
dataset=read.csv('Retail.csv',header=TRUE)
dataset=read.transactions('Retail.csv',sep=',',rm.duplicates = TRUE)
summary(dataset)
itemFrequencyPlot(dataset,topN=10)

rules=apriori(data=dataset,parameter = list(support=0.2,confidence=0.4))

inspect(sort(rules,by='lift')[1:4])