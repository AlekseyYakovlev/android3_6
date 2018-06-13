package ru.geekbrains.android3_6.model.di.modules;

import dagger.Module;
import dagger.Provides;
import ru.geekbrains.android3_6.model.cache.ICache;
import ru.geekbrains.android3_6.model.cache.RealmCache;

@Module
public class CacheModule
{
    @Provides
    public ICache cache()
    {
        return new RealmCache();
    }
}
