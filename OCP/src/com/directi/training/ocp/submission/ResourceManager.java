package com.directi.training.ocp.submission;

public interface ResourceManager {
    void markFree(int resourceId);
    void markBusy(int resourceId);
    int findFree();
}
