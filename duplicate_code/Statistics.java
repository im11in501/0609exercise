package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
	public double sum_average(double[] elements)
	{
		double sum = 0;
		double average;
		for(double element : elements)
		{
			sum+=element;
		}
		average = sum/elements.length;
		return average;
	}
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        double average1;
		average1 = sum_average(array1);
        
		double average2;
		average2 = sum_average(array2);

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double average1;
        average1 = sum_average(elements);
		
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
	
}