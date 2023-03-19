# id_50_Test.java
from original.id_50 import decode_shift

import pytest

class id_50_Test:
    """
    Test class of id_50.py.
    It contains ten unit test cases for the :func:`original.id_50.decode_shift`.
    """


    def test_decode_shift_1(self):
        """
        Test case 1 for :func:`original.id_50.decode_shift`.
        """
        assert decode_shift("fqjcb rwjwj vnjax bnkhj whxcq nawjv nfxdu mbvnu ujbbf nnc") == "equality is not a living breathing entity"

    def test_decode_shift_2(self):
        """
        Test case 2 for :func:`original.id_50.decode_shift`.
        """
        assert decode_shift("oczmz vmzor jocdi bnojv dhvod igdaz admno ojbzo rcvot jprvi oviyv aozmo cvooj ziejt dojig toczr dnzno jahvi fdiyv xcdzq zoczn zxjiy") == "the quick brown fox jumps over the lazy dog"

    def test_decode_shift_3(self):
        """
        Test case 3 for :func:`original.id_50.decode_shift`.
        """
        assert decode_shift("ejitp spawa qleji taiul rtwll rflrl laoat wsqqj atgac kthls iraoa twlpl qjatw jufrh lhuts qataq itats aittk stqfj cae") == "i am not what i am"

    def test_decode_shift_4(self):
        """
        Test case 4 for :func:`original.id_50.decode_shift`.
        """
        assert decode_shift("iyhqz ewqin azqej shayz niqbe aheum hnmnj jaqii yuexq ayqkn jbeuq iihed yzhni ifnun sayiz yudhe sqshu qesqa iluym qkque aqaqm oejjs hqzyu jdzqa diesh niznj jayzy uiqhq vayzq shsnj jejjz nshna hnmy") == "the quick brown fox jumps over the lazy dog"

    def test_decode_shift_5(self):
        """
        Test case 5 for :func:`original.id_50.decode_shift`.
        """
        assert decode_shift("vhfin mxzbw vhfiv rhnvt vgvhg rfmvh nhcvr gfivg vhgvh gvhhr vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvhg vhgvh gvhgv hgvh