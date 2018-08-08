#!groovy
/**
  * Set Discard old builds properties
  * To be placed before the "stage phases" of the job
  * Overrides all set current job properties
**/


def call(String artiDaysToKeep, String artiNumToKeep, String daysToKeep, String numToKeep ) {


    discardList = []
    discardList.add(BuildDiscarderProperty(strategy(setDiscardProperties(
            '',
            '1',
            '60',
            '60'))));



    /*
    def discardList = ""
    print('working 1')
    discardList.push(buildDiscarder(setDiscardProperties(
                '7',
                '25',
                '2',
                '2')))
    print('working2')
    */
    properties([
        discardList
    ])
}
