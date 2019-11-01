package id.ac.polinema.skorbasket.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;

public class SharedScore extends AndroidViewModel {

    private MediatorLiveData<Integer> scoreHome;
    private MediatorLiveData<Integer> scoreVisitor;
    private MediatorLiveData<Boolean> winner;

    public SharedScore(@NonNull Application application) {
        super(application);
        scoreHome = new MediatorLiveData<>();
        scoreVisitor = new MediatorLiveData<>();
        winner = new MediatorLiveData<>();
    }

    public void setScoreHome(Integer score){
        scoreHome.setValue(score);
    }

    public LiveData<Integer> getScoreHome(){
        return scoreHome;
    }

    public void setScoreVisitor(Integer score){
        scoreVisitor.setValue(score);
    }

    public LiveData<Integer> getScoreVisitor(){
        return scoreVisitor;
    }

    public void setWinner(Boolean result){
        winner.setValue(result);
    }

    public LiveData<Boolean> getWinner(){
        return winner;
    }
}
