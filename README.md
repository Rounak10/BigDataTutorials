# BigDataTutorials
## Sample code revolving around Hadoop and Hbase 


# Build Jar
First checkout and import this project in IntelliJ IDE.\
Build the project.\
Go to root of the directory and run --> ./gradlew build jar\
After this Jar will be created in ReduceSideJoin/build/libs/


# Upload Dataset to HDFS
hadoop fs -CopyFromLocal dataset.txt /dataset.txt

# Run ReduceSideJoin MapReduce Jar.
hadoop jar <jarName> <inputDatasetPathAndFile> <outputDirectory>
  
  

Cust_details

| CustId | FirtName | LastName | Age | Profession |
|:-------| :--------| :--------| :---| :----------|
|4000001|Kristina|Chung|55|Pilot|
|4000002|Paige|Chen|74|Teacher|
|4000003|Sherri|Melton|34|Firefighter|
|4000004|Gretchen|Hill|66|Computer hardware engineer|
|4000005|Karen|Puckett|74|Lawyer|
|4000006|Patrick|Song|42|Veterinarian|
|4000007|Elsie|Hamilton|43|Pilot|
|4000008|Hazel|Bender|63|Carpenter|
|4000009|Malcolm|Wagner|39|Artist|
|4000010|Dolores|McLaughlin|60|Writer|

Transaction_details

| TransId| Date| CustId|Amount| GameType| Equipment| City| State| Mode|
|:-------| :---| :-----|:-----|:--------|:---------|:----|:-----|:----|
|00000000|06-26-2011|4000001|040.33|Exercise & Fitness|Cardio Machine Accessories|Clarksville|Tennessee|credit |
|00000001|05-26-2011|4000002|198.44|Exercise & Fitness|Weightlifting Gloves|Long Beach|California|credit |
|00000002|06-01-2011|4000002|005.58|Exercise & Fitness|Weightlifting Machine Accessories|Anaheim|California|credit |
|00000003|06-05-2011|4000003|198.19|Gymnastics|Gymnastics Rings|Milwaukee|Wisconsin|credit|
|00000004|12-17-2011|4000002|098.81|Team Sports|Field Hockey|Nashville|Tennessee|credit|
|00000005|02-14-2011|4000004|193.63|Outdoor Recreation|Camping & Backpacking & Hiking|Chicago|Illinois|credit |
|00000006|10-28-2011|4000005|027.89|Puzzles|Jigsaw Puzzles|Charleston|South Carolina|credit |
|00000007|07-14-2011|4000006|096.01|Outdoor Play Equipment|Sandboxes|Columbus|Ohio|credit |
|00000008|01-17-2011|4000006|010.44|Winter Sports|Snowmobiling|Des Moines|Iowa|credit |
|00000009|05-17-2011|4000006|152.46|Jumping|Bungee Jumping|St. Petersburg|Florida|credit |
|00000010|05-29-2011|4000007|180.28|Outdoor Recreation|Archery|Reno|Nevada|credit |
|00000011|06-18-2011|4000009|121.39|Outdoor Play Equipment|Swing Sets|Columbus|Ohio|credit |
|00000012|02-08-2011|4000009|041.52|Indoor Games|Bowling|San Francisco|California|credit|
|00000013|03-13-2011|4000010|107.80|Team Sports|Field Hockey|Honolulu|Hawaii|credit|
|00000014|02-25-2011|4000010|036.81|Gymnastics|Vaulting Horses|Los Angeles|California|credit|
|00000015|10-20-2011|4000001|137.64|Combat Sports|Fencing|Honolulu|Hawaii|credit|
|00000016|05-28-2011|4000010|035.56|Exercise & Fitness|Free Weight Bars|Columbia|South Carolina|credit|
|00000017|10-18-2011|4000008|075.55|Water Sports|Scuba Diving & Snorkeling|Omaha|Nebraska|credit|
|00000018|11-18-2011|4000008|088.65|Team Sports|Baseball|Salt Lake City|Utah|credit|
|00000019|08-28-2011|4000008|051.81|Water Sports|Life Jackets}Newark|New Jersey|credit|
|00000020|06-29-2011|4000005|041.55|Exercise & Fitness|Weightlifting Belts|New Orleans|Louisiana|credit|
|00000021|02-14-2011|4000005|045.79|Air Sports|Parachutes|New York|New York|credit|
|00000022|10-10-2011|4000009|019.64|Water Sports|Kitesurfing|Saint Paul|Minnesota|credit|
|00000023|05-02-2011|4000009|099.50|Gymnastics|Gymnastics Rings|Springfield|Illinois|credit|
|00000024|06-10-2011|4000003|151.20|Water Sports|Surfing|Plano|Texas|credit|
|00000025|10-14-2011|4000009|144.20|Indoor Games|Darts|Phoenix|Arizona|credit|
|00000026|10-11-2011|4000009|031.58|Combat Sports|Wrestling|Orange|California|credit|
|00000027|09-29-2011|4000010|066.40|Games|Mahjong|Fremont|California|credit|
|00000028|05-12-2011|4000008|079.78|Team Sports|Cricket|Lexington|Kentucky|credit|
|00000029|06-03-2011|4000001|126.90|Outdoor Recreation|Hunting|Phoenix|Arizona|credit|
|00000030|03-14-2011|4000001|047.05|Water Sports|Swimming|Lincoln|Nebraska|credit|
|00000031|11-28-2011|4000008|005.03|Games|Dice & Dice Sets|Los Angeles|California|credit|
|00000032|01-29-2011|4000008|020.13|Team Sports|Soccer|Springfield|Illinois|credit|
|00000033|06-15-2011|4000008|154.15|Outdoor Recreation|Lawn Games|Nashville|Tennessee|credit|
|00000034|05-06-2011|4000008|098.96|Team Sports|Indoor Volleyball|Atlanta|Georgia,|Credit|
|00000035|04-12-2011|4000008|185.26|Games|Board Games|Centennial|Colorado|credit|
|00000036|10-13-2011|4000007|035.66|Team Sports|Football|Saint Paul|Minnesota|credit|
