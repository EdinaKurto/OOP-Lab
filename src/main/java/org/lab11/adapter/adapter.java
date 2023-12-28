package org.lab11.adapter;

interface OldDevice {
    void operateOldFunction();
}

interface NewDevice {
    void operateNewFunction();
}

class OldDeviceImpl implements OldDevice {
    @Override
    public void operateOldFunction() {
        System.out.println("Operating old function in the old device.");
    }
}

class NewDeviceImpl implements NewDevice {
    @Override
    public void operateNewFunction() {
        System.out.println("Operating new function in the new device.");
    }
}

class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        System.out.println("Adapter: Converting new function call to old function call.");
        oldDevice.operateOldFunction();
    }
}

class Main {
    public static void main(String[] args) {
        NewDevice newDevice = new NewDeviceImpl();
        newDevice.operateNewFunction();

        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice adaptedDevice = new DeviceAdapter(oldDevice);
        adaptedDevice.operateNewFunction();
    }
}
