package com.nespresso.nesoa.fizzbuzz;

import java.util.Iterator;

public class FizzBuzzIterator implements Iterator<Integer>
{

	private final int start;
	private final int end;
	private int current;

	public FizzBuzzIterator(int start, int end)
	{
		this.start = start;
		this.end = end;
		
		current = this.start - 1;
	}

	@Override
	public boolean hasNext()
	{
		return current < end;
	}

	@Override
	public Integer next()
	{
		return ++current;
	}
	
	public boolean isFizz ()
	{
		return current % 3 == 0;
	}
	
	public boolean isBuzz ()
	{
		return current % 5 == 0;
	}
	
	public boolean isFizzBuzz ()
	{
		return isFizz() && isBuzz();
	}
	
}
