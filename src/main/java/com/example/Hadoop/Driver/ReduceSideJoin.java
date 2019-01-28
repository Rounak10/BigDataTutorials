package com.example.Hadoop;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper.CustsMapper;
import org.apache.hadoop.mapreduce.Mapper.TxnsMapper;
import org.apache.hadoop.mapreduce.Reducer.ReduceJoinReducer;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class ReduceSideJoin {

  public static void main(String[] args) throws Exception {
          Configuration conf = new Configuration();
          Job job = Job.getInstance(conf, "Reduce-side join");
          job.setJarByClass(ReduceSideJoin.class);
          job.setReducerClass(ReduceJoinReducer.class);
          job.setOutputKeyClass(Text.class);
          job.setOutputValueClass(Text.class);

          MultipleInputs.addInputPath(job, new Path(args[0]),TextInputFormat.class, CustsMapper.class);
          MultipleInputs.addInputPath(job, new Path(args[1]),TextInputFormat.class, TxnsMapper.class);
          Path outputPath = new Path(args[2]);

          FileOutputFormat.setOutputPath(job, outputPath);
          outputPath.getFileSystem(conf).delete(outputPath, true);
          System.exit(job.waitForCompletion(true) ? 0 : 1);
      }
}
