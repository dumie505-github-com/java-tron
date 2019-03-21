package org.tron.common.zksnark.sapling.note;

import java.util.List;
import java.util.Optional;
import org.tron.common.zksnark.merkle.IncrementalMerkleVoucherContainer;
import org.tron.common.zksnark.sapling.address.IncomingViewingKey;

public class NoteData {

  public List<IncrementalMerkleVoucherContainer> vouchers;
  public int witnessHeight;
  public IncomingViewingKey ivk;
  public Optional<byte[]> nullifier; // 256
}
