package com.example.Hadoop.Reducer;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public static class ReduceJoinReducer extends Reducer <Text, Text, Text, Text>
    {
        public void reduce(Text key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException
        {
            String name = "";
            double total = 0.0;
            int count = 0;
            for (Text t : values)
            {
                String parts[] = t.toString().split("\t");
                if (parts[0].equals("tnxn"))
                {
                    count++;
                    total += Float.parseFloat(parts[1]);
                }
                else if (parts[0].equals("cust"))
                {
                    name = parts[1];
                }
            }
            String str = String.format("%d\t%f", count, total);
            context.write(new Text(name), new Text(str));
        }
    }
