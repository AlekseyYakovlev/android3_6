package ru.geekbrains.android3_6;

import io.paperdb.Paper;
import io.realm.Realm;
import ru.geekbrains.android3_6.model.di.AppComponent;
import ru.geekbrains.android3_6.model.di.DaggerAppComponent;
import ru.geekbrains.android3_6.model.di.modules.AppModule;

public class App extends com.activeandroid.app.Application
{
    private static App instance;

    private AppComponent appComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        instance = this;
        Paper.init(this);
        Realm.init(this);

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

    }

    public static App getInstance()
    {
        return instance;
    }

    public AppComponent getAppComponent()
    {
        return appComponent;
    }
}
