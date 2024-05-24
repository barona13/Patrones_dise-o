package com.state;

public class User {
    private State state;
    private boolean enable;
    private boolean buying;

    public User() {
        this.state = new ActiveState(this);
        this.enable = true;
        this.buying = false;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String onActive() {
        return state.onActive();
    }

    public String onDisable() {
        return state.onDisable();
    }

    public String onLock() {
        return state.onLock();
    }

    public String onBuy() {
        return state.onBuy();
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isBuying() {
        return buying;
    }

    public void setBuying(boolean buying) {
        this.buying = buying;
    }

    public String startBuy() {
        if (enable) {
            this.buying = true;
            return "Started buying...";
        } else {
            return "Cannot start buying, user is not enabled.";
        }
    }
}
