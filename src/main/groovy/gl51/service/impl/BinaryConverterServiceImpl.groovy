package gl51.service.impl

import gl51.data.Ip
import gl51.service.ip.IPService
import gl51.service.ip.IpConverterService

import javax.inject.Inject

class BinaryConverterServiceImpl implements IpConverterService {

    @Inject
    IPService service

    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()
        ///
    }
}
