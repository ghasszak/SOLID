package com.directi.training.isp.submission;

public class Door {
    private boolean _locked;
    private boolean _opened;

    public void setLocked(boolean locked) {
        this._locked = locked;
    }

    public void setOpened(boolean opened) {
        this._opened = opened;
    }

    public void lock()
    {
        _locked = true;
    }

    public void unlock()
    {
        _locked = false;
    }

    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    public void close()
    {
        _opened = false;
    }
}
