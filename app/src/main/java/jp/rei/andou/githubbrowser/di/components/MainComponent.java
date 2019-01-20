package jp.rei.andou.githubbrowser.di.components;

import android.support.v4.app.FragmentManager;

import dagger.BindsInstance;
import dagger.Component;
import jp.rei.andou.githubbrowser.di.modules.MainModule;
import jp.rei.andou.githubbrowser.di.scopes.MainScope;
import jp.rei.andou.githubbrowser.presentation.MainActivity;

@Component(dependencies = AppComponent.class, modules = {MainModule.class})
@MainScope
public interface MainComponent {

    void inject(MainActivity mainActivity);
    FragmentManager fragmentManager();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder bindMainActivity(MainActivity mainActivity);
        Builder withAppComponent(AppComponent appComponent);
        MainComponent build();
    }

}
