package com.example.ai_mad_numgame;

import android.util.Log;

import java.util.Arrays;

public class LR {
    public static double getSlope(int [][] dataframe){
        if(dataframe==null)
            return -100;
        int sample_size=dataframe.length; //6
        int predictor[]=new int[sample_size];
        int response[]=new int[sample_size];
        int squarePredictor[]=new int[sample_size];
        int productPredictorResposne[]=new int[sample_size];


        for(int i=0;i< dataframe.length;i++) {
            predictor[i] = dataframe[i][0];
            response[i]=dataframe[i][1];
            squarePredictor[i]=dataframe[i][0]*dataframe[i][0];
            productPredictorResposne[i]=dataframe[i][0]*dataframe[i][1];
        }
        Log.i("Predictor", Arrays.toString(predictor));
        Log.i("response", Arrays.toString(response));
        Log.i("squaredPredictor", Arrays.toString(squarePredictor));
        Log.i("productPredictorResp", Arrays.toString(productPredictorResposne));

        int sigmaX=getSigma(predictor);
        int sigmaY=getSigma(response);
        int sigmaXsquare=getSigma(squarePredictor);
        int sigmaXY=getSigma(productPredictorResposne);
        Log.i("SigmaXr", sigmaX+"");
        Log.i("SigmaY", sigmaY+"");
        Log.i("SigmaXSquarer", sigmaXsquare+"");
        Log.i("SigmaXY", sigmaXY+"");
        double numerator=sample_size*sigmaXY-(sigmaX*sigmaY);
        Log.i("Numerator",numerator+"");
        double denominator=sample_size*sigmaXsquare-Math.pow(sigmaX,2);
        Log.i("Denominator",denominator+"");
        double slope= numerator/denominator;
        return slope;
    }
    static int getSigma(int[]predictor){
        int sum=0;
        for(int i=0;i<predictor.length;i++)
            sum+=predictor[i];
        return sum;
    }


}
