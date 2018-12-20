package scheduler.kaushambi.project;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyObject implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	
		System.out.println("My scheduler is running !!! \nKaam chal raha h !!");
		System.out.println("The time now is: "+new Date());
		
	}

}
