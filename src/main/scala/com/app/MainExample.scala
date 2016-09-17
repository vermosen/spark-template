package com.app

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.log4j.Logger

object MainExample {

  def main(arg: Array[String]) {

    val conf = new SparkConf()
    conf.setAppName("helloWorld")
        .setMaster("local")
      
    val sc = new SparkContext(conf)
    sc.setLogLevel("WARN")
    
    val data = Array(1, 2, 3, 4, 5)
    val distData = sc.parallelize(data)
    
    // do stuff
    println("Hello, world!")
    
    // terminate spark context
    sc.stop()
  }
}
