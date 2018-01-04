package org.hvbuilders

public class LoadBuildData

  public def LoadBuildControlData(dataFileName){
    
    //def textData = libraryResource "org/hvbuilders/${dataFileName}"
    def controlData = readYaml file: textData

    def builds = []
    controlData.jobGroups.each{  group ->
      group.getValue().each { job ->

        def jobData = "${group.getKey()}, ${job.jobID}, ${job.scmUrl}, ${job.scmBranch}, ${job.executeFlag}, ${job.versionProperty}," +
          " ${job.directives}"
        builds.add(jobData)
      }
    }
    return builds
  }

}


