package scheduler.kaushambi.project;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class MyMainScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws SchedulerException {
		
		JobDetail myJob = JobBuilder.newJob(MyObject.class).build();	//set the name of the job here in place of MyObject
		
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("CroneTrigger")
					.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(02)	//at an interval of 2 seconds
						.repeatForever()).build();	//job scheduled forever
		
		Scheduler s = StdSchedulerFactory.getDefaultScheduler();
		
		s.start();
		s.scheduleJob(myJob, trigger);
		System.out.println("Hello World");

	}

}
