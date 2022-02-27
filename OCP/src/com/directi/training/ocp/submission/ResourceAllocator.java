package com.directi.training.ocp.submission;

public class ResourceAllocator {
    private final ResourceManager _resourceManager;

    public ResourceAllocator(ResourceManager resourceManager) {
        this._resourceManager = resourceManager;
    }

    public int allocate(){
        int resourceId = this._resourceManager.findFree();
        this._resourceManager.markBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId){
        this._resourceManager.markFree(resourceId);
    }
}
