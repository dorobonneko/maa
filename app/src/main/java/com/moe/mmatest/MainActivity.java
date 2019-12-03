package com.moe.mmatest;

import android.app.*;
import android.os.*;
import java.net.ServerSocket;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.InputStream;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateException;
import com.mato.android.matoid.service.mtunnel.HttpHandler;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		 extra("hook.tmp");
		 extra("wspx.tmp");
		 HttpHandler.filesPath=getFilesDir().getAbsolutePath();
		 HttpHandler.init();
		 long time=System.currentTimeMillis();
		try{
			String mma=HttpHandler.getAuthString("1.1.1.1:39990");
			}catch(Exception e){}
    }
	private void extra(String name){
		try
		{
			InputStream is=getAssets().open(name);
			OutputStream out=new FileOutputStream(getFileStreamPath(name));
			int len=-1;
			byte[] buff=new byte[8092];
			while ((len = is.read(buff)) != -1)
			{
				out.write(buff, 0, len);
			}
			out.flush();
			out.close();
			is.close();
		}
		catch (IOException e)
		{}
	}
}
