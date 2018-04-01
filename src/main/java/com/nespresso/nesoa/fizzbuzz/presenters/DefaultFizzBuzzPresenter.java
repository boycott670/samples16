package com.nespresso.nesoa.fizzbuzz.presenters;

import com.nespresso.nesoa.fizzbuzz.FizzBuzzIterator;

public class DefaultFizzBuzzPresenter implements FizzBuzzPresenter
{

	@Override
	public String present(FizzBuzzIterator iterator)
	{
		final StringBuilder output = new StringBuilder();
		
		while (iterator.hasNext())
		{
			output.append(String.format("%d: %s\n", iterator.next(), iterator.isFizzBuzz() ? "FizzBuzz" : (iterator.isFizz() ? "Fizz" : (iterator.isBuzz() ? "Buzz" : ""))));
		}
		
		return output.toString();
	}
	
}
