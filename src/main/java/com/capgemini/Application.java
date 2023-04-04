	package com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		int count0=0;
		int count1=0;
		int count2=0;
		 List<Student> studentlist = new ArrayList<Student>();
		 for (int i = 0; i < 10; i++) {
			 count0++;
				count1++;
				count2++;
			 Student student11 = new Student("raj "+count0,"ram "+count1,"rajesh "+count2);
			 studentlist.add(student11);
			
		}
		 System.out.println("student size =>"+studentlist.size());

		//SpringApplication.run(Application.class, args);
		  // List<Student> list = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
	        /* Change the value of chunkSize to get desired number of elements
	        in the subLists */
	        int chunkSize = 2;
	        AtomicInteger counter = new AtomicInteger();
	        final Collection<List<Student>> partitionList = 
	        		studentlist.stream().collect(Collectors.groupingBy(i -> counter.getAndIncrement() / chunkSize))
	                            .values(); 
	        int count11 =0;
	        System.out.println("partitionList size =>"+partitionList.size());

	        for(List<Student> subList : partitionList) {
	        	count11++; 
	        	System.out.println("chunkSize=============================================================================="+ count11);
	           System.out.println(subList);
	            CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
	    		    @Override
	    		    public void run() {
	    		    	try {
	    		    		
	    		    		System.out.println("thread name:"+Thread.currentThread().getName());
	    		    		for (Student sts : subList) {
	    		    			System.out.println(sts.getId());
	    		    			System.out.println(sts.getName());
	    		    			System.out.println(sts.getNumber());
							}
	    		    		
	    				} catch (Exception e) {
	    					// TODO Auto-generated catch block
	    					e.printStackTrace();
	    				}
	    		    	}
	    		});
	            
	        }    
		
	}
}
