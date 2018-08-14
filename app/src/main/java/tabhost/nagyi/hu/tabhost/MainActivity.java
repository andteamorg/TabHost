package tabhost.nagyi.hu.tabhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;


public class MainActivity extends AppCompatActivity {

    TabHost host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        host = findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        //set the content for the tab as we set content for an activity in the oncreate method
        //you can pass an intent to this as well to load an activity or load a fragment
        //since we have defined our content in the activity_main.xml
        // we will pass the tab1 id to our setcontent method

        spec.setContent(R.id.tab1);
        spec.setIndicator("T");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab Two");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab Three");
        host.addTab(spec);

        //Tab 4
        spec = host.newTabSpec("Tab Four");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Tab Four");
        host.addTab(spec);

        //Tab 5
        spec = host.newTabSpec("Tab Five");
        spec.setContent(R.id.tab5);
        spec.setIndicator("Tab Five55555555555555555555555555");
        host.addTab(spec);

        //Tab 6
        spec = host.newTabSpec("Tab Six");
        spec.setContent(R.id.tab6);
        spec.setIndicator("Tab Six");
        host.addTab(spec);

        //Tab 5
        spec = host.newTabSpec("Tab Seven");
        spec.setContent(R.id.tab7);
        spec.setIndicator("Tab Seven");
        host.addTab(spec);

        //Tab 6
        spec = host.newTabSpec("Tab Eight");
        spec.setContent(R.id.tab8);
        spec.setIndicator("Tab Eight");
        host.addTab(spec);

        //Tab 5
        spec = host.newTabSpec("Tab Nine");
        spec.setContent(R.id.tab9);
        spec.setIndicator("Tab Eight");
        host.addTab(spec);


        //Tab 5
        spec = host.newTabSpec("Tab Ten");
        spec.setContent(R.id.tab10);
        spec.setIndicator("Tab Ten");
        host.addTab(spec);

        //Tab 5
        spec = host.newTabSpec("Tab Eleven");
        spec.setContent(R.id.tab11);
        spec.setIndicator("Tab Eleven");
        host.addTab(spec);

        //Tab 6
        spec = host.newTabSpec("Tab Twelve");
        spec.setContent(R.id.tab12);
        spec.setIndicator("Tab Twelve");
        host.addTab(spec);

        //Tab 6
        spec = host.newTabSpec("Tab Thirteen");
        spec.setContent(R.id.tab13);
        spec.setIndicator("Tab Thirteen");
        host.addTab(spec);

        //Tab 6
        spec = host.newTabSpec("Tab Fourteen");
        spec.setContent(R.id.tab14);
        spec.setIndicator("Tab Fourteen");
        host.addTab(spec);
    }
}
