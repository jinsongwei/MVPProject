package com.williamjin.mvpdanger.view.repolist;

import com.williamjin.mvpdanger.model.Repo;
import com.williamjin.mvpdanger.util.BasePresenter;
import com.williamjin.mvpdanger.util.BaseView;

import java.util.List;

/**
 * Created by william on 12/19/17.
 */

public interface RepoListContract {

    interface View extends BaseView {
        void setFullName(String fullName);
        void setRepos(List<Repo> repos);
    }

    interface Presenter extends BasePresenter<View> {
        void getFullName(String firstName, String lastName);

        void getRepos(String username);
    }
}
