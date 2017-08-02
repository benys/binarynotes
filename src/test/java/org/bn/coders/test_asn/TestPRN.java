
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1String;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;
import org.bn.coders.UniversalTag;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "TestPRN" )
    public class TestPRN implements IASN1PreparedElement {
    
            @ASN1String( name = "TestPRN", 
        stringType =  UniversalTag.PrintableString , isUCS = false )
            
            private String value;
            
            public TestPRN() {
            }

            public TestPRN(String value) {
                this.value = value;
            }
            
            public void setValue(String value) {
                this.value = value;
            }
            
            public String getValue() {
                return this.value;
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TestPRN.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            