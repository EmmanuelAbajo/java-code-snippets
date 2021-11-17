package com.esc.functionalProgramming;

@FunctionalInterface
public interface Orchestrator<T> {
	
	void route(T t);

}
