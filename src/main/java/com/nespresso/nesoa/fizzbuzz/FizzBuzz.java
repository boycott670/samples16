package com.nespresso.nesoa.fizzbuzz;

import java.io.IOException;
import java.io.Writer;

import com.nespresso.nesoa.fizzbuzz.presenters.DefaultFizzBuzzPresenter;
import com.nespresso.nesoa.fizzbuzz.presenters.FizzBuzzPresenter;

public class FizzBuzz
{
	private final FizzBuzzPresenter presenter = new DefaultFizzBuzzPresenter();
	
	private final int start;
	private final int end;
	
	public FizzBuzz(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	
	public void generate (final Writer writer) throws IOException
	{
		writer.write(presenter.present(new FizzBuzzIterator(start, end)));
	}
}
