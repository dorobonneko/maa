package com.mato.android.matoid.service.mtunnel;


public class HttpHandler {
    public static void init() {
       System.loadLibrary("wsld");
       
    }
	public static String filesPath;
	/*public static void addOriginalDestAddr(String string2, int n) {
    }

    public static void addOriginalDestAddr(String string2, int n, int n2) {
	}*/
    public static native String getAuthString(String var0);

    private static native int getBindPort(boolean var0);

    public static int getCpuUsage() {
        return 0;
    }

    public static String getDnsServers() {
        return null;
    }

    public static String getFilesDir() {
        return filesPath;
    }

    public static int getFreeMemory() {
        return 0;
    }

    private static native int getHookVersion();

    private native String getMatoId(String var1, String var2, int var3);

    public static int getNetworkState() {
        return 4;
    }

    /*public static String getOriginalDestAddr(int n) {
        return "";
    }
*/
    public static int getSignalStrength() {
        return 0;
    }

    private static native long[] getTMTrafficCount();

    private static native int getVersion();

    private native void handleHTTP();

    public static int isCatchNativeCrash() {
        return 1;
    }

    private static native boolean isTunnelEstablished();

    private native void onAuthResponse(int var1);

    public static void onHttpFailed(int n, String string2) {
    }

    public static void onNdkCrashed() {
    }

    public static void onPostTMUrl(String[] arrstring, int n) {
    }

    private native void resetCustomHeaders(String[] var1, int var2);

    private native void resetTunnel(boolean var1);

    private native void setBypassRemoteProxy(boolean var1);

    private native void setFrigateInfo(String var1);

    private native void setNativeCrashLogPath(String var1);

    private native void setSettings(byte[] var1, int var2, boolean var3);

    private native void stopServer();

    public native void dlopenNULLTest();

    public native int hook();

    
    public native void setHookDlopenEnabled(boolean var1);

    public native int setHookEnabled(int var1);

    public native int setHookLogPath(String var1);

    public native int setHookLogState(int var1);
}

