package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

  private World world;
  private int index;

  public CountryIterator(World world) {
    this.world = world;
    index = 0;
  }

  @Override
  public boolean hasNext() {
    return (index < world.getCountries().length);
  }

  @Override
  public Country next() {
    if(hasNext()) {
      return world.getCountries()[index++];
    }
    return null;
  }

}
