import re.hub.commithub.rest.commit.CommitCheckRequest
import re.hub.commithub.ruleScriptAnnotations.RuleParameter
import re.hub.commithub.ruleScriptAnnotations.RuleScript
import re.hub.commithub.ruleScriptAnnotations.RuleParameterValue

@RuleScript(ruleName = "Script from repo", ruleDescription = "Put a short string here: {{astring}} ")
class DummyRule {

    @RuleParameter(type=RuleParameter.Type.STRING, name="astring", required=true)
    String astring = "defaultvalue"

    boolean check(CommitCheckRequest commitCheckRequest, OutputStream outputCommitMessage) {
        return true;
    }
}