#!groovy
/**
  * Set Discard old builds properties
  * To be placed before the "stage phases" of the job
  * Overrides all set current job properties
**/


def call(String artiDaysToKeep, String artiNumToKeep, String daysToKeep, String numToKeep ) {

    discardList = []
    discardList.push(BuildDiscarderProperty(strategy(setDiscardProperties.call(
            artifactDaysToKeepStr: '',
            artifactNumToKeepStr: '1',
            daysToKeepStr: '60',
            numToKeepStr: '60'))))


    properties([
        discardList
    ])
}
