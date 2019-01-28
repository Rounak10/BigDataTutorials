# BigDataTutorials
## Sample code revolving around Hadoop and Hbase 


# Build Jar
*First checkout and import this project in IntelliJ IDE.
*Build the project.
*Go to root of the directory and run --> ./gradlew build jar
*After this Jar will be created in ReduceSideJoin/build/libs/


# Upload Dataset to HDFS
*hadoop fs -CopyFromLocal dataset.txt /dataset.txt

# Run ReduceSideJoin MapReduce Jar.
*hadoop jar <jarName> <inputDatasetPathAndFile> <outputDirectory>
