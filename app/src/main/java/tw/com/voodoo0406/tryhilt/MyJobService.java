package tw.com.voodoo0406.tryhilt;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

public class MyJobService extends JobService {

  public static final int MY_JOB_SERVICE_ID = 5566;

  public MyJobService() {
  }

  public static void enqueueService(Context context) {
    Log.d("GGGGG", "enqueueService: ");
    JobInfo jobInfo = new Builder(MY_JOB_SERVICE_ID, new ComponentName(context, MyJobService.class))
        .setOverrideDeadline(0).build();
    JobScheduler jobScheduler = (JobScheduler) context
        .getSystemService(Context.JOB_SCHEDULER_SERVICE);
    jobScheduler.cancel(MY_JOB_SERVICE_ID);
    jobScheduler.schedule(jobInfo);
  }

  @Override
  public boolean onStartJob(JobParameters params) {
    Log.d("GGGGG", "onStartJob: ");
    return false;
  }

  @Override
  public boolean onStopJob(JobParameters params) {
    Log.d("GGGGG", "onStopJob: ");
    return false;
  }

}
