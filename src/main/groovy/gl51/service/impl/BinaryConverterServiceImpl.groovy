package gl51.service.impl

import gl51.data.Ip
import gl51.service.IP.IPService
import gl51.service.IP.IpConverterService

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
