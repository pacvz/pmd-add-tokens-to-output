/* Generated By:JJTree: Do not edit this line. ASTPipelineStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTPipelineStatement extends SimpleNode {
  public ASTPipelineStatement(int id) {
    super(id);
  }

  public ASTPipelineStatement(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=41d2e167a6be4779a43fd91cca82c9c0 (do not edit this line) */