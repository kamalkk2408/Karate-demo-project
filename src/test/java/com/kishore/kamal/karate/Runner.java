package com.kishore.kamal.karate;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
//import com.intuit.karate.junit5.Karate;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "src/test/java/features", tags = "~@ignore")
public class Runner {
}
