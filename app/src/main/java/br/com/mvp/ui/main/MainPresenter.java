package br.com.mvp.ui.main;

public class MainPresenter implements MainContract.Presenter{
    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void pSignIn(String login, String password) {
        //Erro aconteceu
        view.vShowMessage("Erro ao fazer xyz");
    }
}
