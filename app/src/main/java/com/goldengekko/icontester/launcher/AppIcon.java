//package com.goldengekko.icontester.launcher;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.content.pm.ResolveInfo;
//import android.graphics.drawable.Drawable;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by gguser on 8/18/15.
// */
//public class AppIcon {
//
//    private PackageManager manager;
//    private List<AppDetail> apps;
//    private void loadApps(Activity activity){
//        activity.getPackageName();
//        manager = activity.getPackageManager();
//        apps = new ArrayList<AppDetail>();
//
//        Intent i = new Intent(Intent.ACTION_MAIN, null);
//        i.addCategory(Intent.CATEGORY_LAUNCHER);
//
//        List<ResolveInfo> availableActivities = manager.queryIntentActivities(i, 0);
//        for(ResolveInfo ri : availableActivities){
//            AppDetail app = new AppDetail();
//            app.label = ri.loadLabel(manager);
//            app.name = ri.activityInfo.packageName;
//            app.icon = ri.activityInfo.loadIcon(manager);
//            apps.add(app);
//        }
//    }
//
//    public class AppDetail {
//        CharSequence label;
//        CharSequence name;
//        Drawable icon;
//    }
//}
