#!/usr/bin/env groovy

import org.hvbuilders.*

def call(String dataFilePath = 'resources/builders/buildControlData.yaml') {
  echo "Loading build data from ${dataFilePath}"
  def loader = new LoadBuildData()
  def data = loader.LoadBuildControlData(dataFilePath)

  return data
}