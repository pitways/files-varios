package org.nmrao.soapuiext.impl
import com.eviware.soapui.model.support.ProjectRunListenerAdapter
import com.eviware.soapui.model.testsuite.ProjectRunContext
import com.eviware.soapui.model.testsuite.ProjectRunner
import com.eviware.soapui.model.testsuite.TestSuite
import com.eviware.soapui.model.testsuite.TestSuiteRunner
import org.apache.log4j.Logger
import org.nmrao.soapuiext.SoapUIGroovyScriptEngineHelper

import static org.apache.log4j.Logger.getLogger
import static org.nmrao.soapuiext.SoapUIGroovyScriptEngineHelperUtil.getInstance

class ProjectRunListener extends ProjectRunListenerAdapter {

    private Logger log = getLogger(ProjectRunListener.class)

    @Override
    void afterTestSuite(ProjectRunner projectRunner, ProjectRunContext runContext, TestSuiteRunner testSuiteRunner) {
        SoapUIGroovyScriptEngineHelper scriptEngineHelper = getInstance('PROJECT_AFTER_TEST_SUITE',runContext,null,log)
        scriptEngineHelper.scriptEngine.setVariable('testSuiteRunner', testSuiteRunner)
        scriptEngineHelper.scriptEngine.setVariable('projectRunner', projectRunner)
        log.info('Setting testSuiteRunner, projectRunner, context(project run context), and log variables')
        scriptEngineHelper.run()
    }

    @Override
    void beforeTestSuite(ProjectRunner projectRunner, ProjectRunContext runContext, TestSuite testSuite) {
        SoapUIGroovyScriptEngineHelper scriptEngineHelper = getInstance('PROJECT_BEFORE_TEST_SUITE',runContext,null,log)
        scriptEngineHelper.scriptEngine.setVariable('projectRunner',projectRunner)
        scriptEngineHelper.scriptEngine.setVariable('testSuite', testSuite)
        log.info('Setting projectRunner, testSuite, context(project run context), and log variables')
        scriptEngineHelper.run()
    }

    @Override
    void beforeRun(ProjectRunner projectRunner, ProjectRunContext runContext) {
        SoapUIGroovyScriptEngineHelper scriptEngineHelper = getInstance('PROJECT_BEFORE_RUN',runContext,null,log)
        scriptEngineHelper.scriptEngine.setVariable('projectRunner',projectRunner)
        log.info('Setting projectRunner, context(project run context), and log variables')
        scriptEngineHelper.run()
    }

    @Override
    void afterRun(ProjectRunner projectRunner, ProjectRunContext runContext) {
        SoapUIGroovyScriptEngineHelper scriptEngineHelper = getInstance('PROJECT_AFTER_RUN',runContext,null,log)
        scriptEngineHelper.scriptEngine.setVariable('projectRunner',projectRunner)
        log.info('Setting projectRunner, context(project run context), and log variables')
        scriptEngineHelper.run()
    }
}
