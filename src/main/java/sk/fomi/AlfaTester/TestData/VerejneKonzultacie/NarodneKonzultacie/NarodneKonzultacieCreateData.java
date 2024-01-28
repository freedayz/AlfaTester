package sk.fomi.AlfaTester.TestData.VerejneKonzultacie.NarodneKonzultacie;

import sk.fomi.AlfaTester.TestData.BaseData;

public class NarodneKonzultacieCreateData extends BaseData {

    private final String[] nazovDataset = {
            "Test1",
            "Test2",
            "Test3",
            "Test4",
            "Test5",
            "Test6"
    };

   public NarodneKonzultacieCreateData() {
       appendValues("nazov",nazovDataset);
   }
}
