package com.michalfujak.marvel_zadanie.Authorization;

import android.util.Log;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

public class Auth
{

    public String timeStamp = "1";
    public String PUBLIC_KEY = "a93d8ad6a40b56fb07049d98fdd4e586";
    public String PRIVATE_KEY = "ff3d403ccd638739808edfe235404cf1e141b79b";
    public String Limit = "50";


    public String hashData()
    {
        String input = timeStamp + PRIVATE_KEY + PUBLIC_KEY;

        try
        {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes());

            byte[] messageDigest = digest.digest();

            // Create HEX String
            StringBuffer hexString = new StringBuffer();

            for(int i = 0; i < messageDigest.length; i++)
            {
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }
            return hexString.toString();

        }
        catch(NoSuchAlgorithmException e)
        {
            Log.d("Error MD Hash", e.getMessage());
        }

        return "";
    }
}
