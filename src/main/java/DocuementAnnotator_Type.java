
/* First created by JCasGen Wed Sep 11 08:41:40 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 11 15:50:54 EDT 2013
 * @generated */
public class DocuementAnnotator_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DocuementAnnotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DocuementAnnotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DocuementAnnotator(addr, DocuementAnnotator_Type.this);
  			   DocuementAnnotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DocuementAnnotator(addr, DocuementAnnotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocuementAnnotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("DocuementAnnotator");
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "DocuementAnnotator");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "DocuementAnnotator");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DocuementAnnotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    