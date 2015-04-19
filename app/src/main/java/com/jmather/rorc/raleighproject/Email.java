package com.jmather.rorc.raleighproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.net.URL;

/**
 * Created by Josh on 4/19/2015.
 */
public class Email
{
    public void sendEmail(int day, String toEmail, String fromEmail,String fromName, double miles)
    {
        if (day == 7)
        {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.putExtra(Intent.EXTRA_EMAIL, toEmail);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, new String[]{"Driving Reimbursements"});
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Use this e-mail " + fromEmail + " to tranfer a reimbursment to " + fromName + " at https://paypal.com for " + miles + "miles");

        }

    }
}
