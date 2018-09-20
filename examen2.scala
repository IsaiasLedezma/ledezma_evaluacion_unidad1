#1
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

#2
val exa = spark.read.option("header", "true").option("inferSchema","true").csv("Netflix_2011_2016.csv")

#3
df.columns

#4
exa.printSchema()

#5
exa.select($"Date",$"Open",$"High",$"Low").show()

#6
exa.describe().show()

#7
val exa2 = exa.withColumn("HV Ratio", exa("High")+exa("Low"))
exa2.show
#8
exa.filter($"High">500).show()

#9

Cuanto termino en la bolsa de valores
#10
exa.select(max("Volume"),min("Volume")).show()
11
a exa.filter(($"Close" < 600)).count()
b val x = exa.filter($"High">500).count() *100/exa.count()
c exa.select(corr( "High","Volumen")).show()

#d
val equis1 = exa.withColumn("Year",year(exa("Date")))
val equis3 = equis1.groupBy("Year").max()
equis3.select($"Year", $"max(High)").orderBy("Year").show()

e val equis4 = exa.withColumn("Month", month(exa("Date")))
val equis5 = equis4.groupBy("Month").mean()
equis5.select($"Month",$"avg(Close)").orderBy("Month").show()
