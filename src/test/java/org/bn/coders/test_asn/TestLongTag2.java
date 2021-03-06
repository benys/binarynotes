
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1Choice;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;




    @ASN1PreparedElement
    @ASN1Choice ( name = "TestLongTag2" )
    public class TestLongTag2 implements IASN1PreparedElement {
            
        @ASN1Element ( name = "testa", isOptional =  false , hasTag =  true, tag = 33 , hasDefaultValue =  false  )
    
	private TestLongTag2Choice testa = null;
                
  
        
        public TestLongTag2Choice getTesta () {
            return this.testa;
        }

        public boolean isTestaSelected () {
            return this.testa != null;
        }

        private void setTesta (TestLongTag2Choice value) {
            this.testa = value;
        }

        
        public void selectTesta (TestLongTag2Choice value) {
            this.testa = value;
                        
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TestLongTag2.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            