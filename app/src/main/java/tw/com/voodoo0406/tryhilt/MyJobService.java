package tw.com.voodoo0406.tryhilt;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.internal.Preconditions;
import javax.inject.Inject;

@AndroidEntryPoint(JobService.class)
public class MyJobService extends Hilt_MyJobService {

  public static final int MY_JOB_SERVICE_ID = 5566;

  @Inject
  Fruit apple;

  @Inject
  public MyJobService() {
    super();
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
    Preconditions.checkNotNull(apple);
    apple.printInfo();
    return false;
  }

  @Override
  public boolean onStopJob(JobParameters params) {
    Log.d("GGGGG", "onStopJob: ");
    return false;
  }

}
