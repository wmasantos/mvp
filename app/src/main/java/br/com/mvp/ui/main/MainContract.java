package br.com.mvp.ui.main;

public interface MainContract {
    interface View {
        void vInitComponents();
        void vShowMessage(String message);
    }

    interface Presenter {
        void pSignIn(String login, String password);
    }
}
